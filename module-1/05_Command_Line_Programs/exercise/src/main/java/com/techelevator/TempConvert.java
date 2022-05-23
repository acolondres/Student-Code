package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		//we know we want to receive user input
		Scanner scanner = new Scanner(System.in);

		//ask user to input temp
		System.out.println("Enter temperature: ");
		String tempInput = scanner.nextLine();
		int temp = Integer.parseInt(tempInput);

		//ask user if their temp is celsius or fahrenheit
		System.out.println("Is this temperature in (C)elsius or (F)ahrenheit");
		String degreeType = scanner.nextLine();

		//convert temp to whichever one it isn't
		if (degreeType.equalsIgnoreCase("C")) {
			double fahrenheit = temp * 1.8 + 32;
			System.out.println(tempInput + degreeType + " is " + fahrenheit + "F");
		} else if (degreeType.equalsIgnoreCase("F")) {
			double celsius = (temp - 32) / 1.8;
			System.out.println(tempInput + degreeType + " is " + celsius + "C");
		} else {
			System.out.println("Please enter a valid degree type");
		}



	}

}
