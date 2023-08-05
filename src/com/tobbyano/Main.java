package com.tobbyano;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Person tobi = new Person();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name:");
            String username = scanner.nextLine();
            System.out.print("Enter a date (YYYY-MM-DD) or 'exit' to quit: ");
            String dob = scanner.nextLine();

            if (dob.equalsIgnoreCase("exit") || username.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            };

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                tobi.setName(username);
                LocalDate date = LocalDate.parse(dob, formatter);
                tobi.setBirthYear(date);
                String name = tobi.getName();
                int age = tobi.age();
                System.out.println("I am " + name + " by name. " + "I am " + age + " years old.");
            } catch (DateTimeParseException error) {
                System.out.println("Invalid date format. Please enter a date in the format YYYY-MM-DD.");
            }
        }
    }
}
