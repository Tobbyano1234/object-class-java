package com.tobbyano;


import java.time.LocalDate;

public class Person {
   private String name;
    private LocalDate birthYear;
    private boolean haveDrivenLicense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public boolean haveDrivenLicense(int age) {
        haveDrivenLicense = (age >= 18);
        return haveDrivenLicense;
    }

    public int age () {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - this.birthYear.getYear();
    }
}
