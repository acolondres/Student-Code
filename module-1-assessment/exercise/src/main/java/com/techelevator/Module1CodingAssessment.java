package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {

		// Instantiate an object, or objects, in main()/Main()
		// and use the objects to test your methods.

		Car car1 = new Car(1992, "Toyota Paseo", true);
		Car car2 = new Car(2015, "Honda Accord", false);

		System.out.println("Your car is a " + car1.getYear() + " " + car1.getMake());
		System.out.println("Considering this was your first car; it is " + car1.isClassic() + " that your car is now a classic.");



		// How to retrieve the current year
		int currentYear = LocalDateTime.now().getYear();
		System.out.println(currentYear);

		// testing year to check for car 2
		System.out.println(car2.needsECheck(2015));

		List<Car> list = new ArrayList<Car>();
		File myFile = new File("CarInput.csv");
		try (Scanner scan = new Scanner(myFile)) {
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] auto = line.split(",");
				int year = Integer.parseInt(auto[0]);
				String make = auto[1];
				boolean isClassicCar = Boolean.parseBoolean(auto[2]);
				list.add(new Car(year, make, isClassicCar));

			}

		}
		catch (FileNotFoundException ex) {
			System.out.println("Sorry your file was not found.");
		}

		int sumAge = 0;
		for(Car a : list) {
			sumAge += a.getYear();
			System.out.println(sumAge);
		}

	}

}
