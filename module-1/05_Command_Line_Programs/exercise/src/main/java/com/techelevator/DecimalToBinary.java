package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		//ask the user to INPUT a series of integer values separated by spaces.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		String decimalValuesEntered = scanner.nextLine();


		// split the user input at the "spaces" so they all display in different lines

		String[] decimalValuesSeparate = decimalValuesEntered.split(" ");

		//display each one of their values with it in binary as well. just add it at the end with example formula
		for(int i = 0; i < decimalValuesSeparate.length; i ++) {
			int inputNumber = Integer.parseInt(decimalValuesSeparate[i]);
			System.out.println(inputNumber + " in binary is " + Integer.toBinaryString(inputNumber));



		}

		Integer.toBinaryString(65); // example with 65 DONT USE 65
	}

}
