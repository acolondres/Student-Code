package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        double discount = Double.parseDouble(input);

        System.out.println("Our discount is: " + input);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String pricesInput = scanner.nextLine();
        String[] prices = pricesInput.split(" ");

        for (int i = 0; i < prices.length; i++) {
            double priceConverted = Double.parseDouble(prices[i]);
            Double newPrice = priceConverted * (1 - (discount/100));
            System.out.println("Original price is $" + prices[i] + " but discounted to $"+);

        }
    }

}