package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scratch {


    public static void main(String[] args) {

        boolean validInput = false;
        while(!validInput) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your dog's age:");
                String ageInput = input.nextLine();

                int dogAgeInHumanYears = Integer.parseInt(ageInput) * 7;

                String myName = null;
                System.out.println("My name is length " + myName.length());

                System.out.println("Your dog is " + dogAgeInHumanYears + " in human years");

                //breaks us out of the while loop
                validInput = true;

            } catch (NumberFormatException ex) {
                System.out.println("Please enter a strictly numeric value");
            } catch(NullPointerException iCouldNameThisAnything) {
                System.out.println("Your name cannot be null");
            } catch (Exception ex) {
                System.out.println("Something went wrong");
            }
        }

    }

    public int[] get123() {
        int[] myArray = {1,2,3};
        return myArray;
    }

    public Map<String, String> getMap() {

        Map<String,String> myMap = new HashMap<>();
        myMap.put("giraffe", "Tower");
        myMap.put("dog", "Pack");

        return myMap;


    }
}
