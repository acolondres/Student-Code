package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length: ");
		String lengthInput = scanner.nextLine();
		int length = Integer.parseInt(lengthInput);

		System.out.println("Is this length in (M)eters or (F)eet?");
		String lengthType = scanner.nextLine();

		if (lengthType.equalsIgnoreCase("M")) {
			double feet = length * 3.2808399;
			System.out.println(lengthInput + lengthType + " converted to feet " + feet + "F");
		} else if (lengthType.equalsIgnoreCase("F")) {
			double meters = length * 0.3048;
			System.out.println(lengthInput + lengthType + " converted to meters is " + meters + "M");
		} else {
			System.out.println("Please enter a valid length");
		}
	}

}
