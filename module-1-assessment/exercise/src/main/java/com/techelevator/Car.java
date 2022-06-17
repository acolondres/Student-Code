package com.techelevator;

import java.time.LocalDateTime;

public class Car {
    // year: indicates the year that the car was manufactured.
    private int year;

    // make: indicates the make of the car.
    private String make;

    // is classic car: indicates if the car is a classic car.
    private boolean isClassicCar;

    // age: indicates the age (in years) of the car from the current year.
    private int age;

    int currentYear = LocalDateTime.now().getYear();

    // Create a constructor that accepts year, make, and is classic car.
    public Car(int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
    }

    //Getters and Setters-------------------------------------------------
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isClassic() {
        return this.isClassicCar;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //---------------------------------------------------------------------
    public boolean needsECheck(int yearToCheck) {
        if (yearToCheck % 2 == 0 && !isClassic() && (currentYear - yearToCheck) > 4 && (currentYear - yearToCheck) < 25) {
            return true;
        } else if (yearToCheck % 2 != 0 && !isClassic() && (currentYear - yearToCheck) > 4 && (currentYear - yearToCheck) < 25) {
            return true;
        } else
        return false;
    }







    //---------------------------------------------------------------------

    @Override
    public String toString() { return "CAR - " + year + " - " + make;}
}
