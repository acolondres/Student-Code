package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		int[] intArray = new int[10];
		String[] stringArray = new String[10];

		List<Integer> intList = new ArrayList<>();
		List<String> stringList = new ArrayList<String>();

		stringList.add("Christopher");
		stringList.add("Anthony");
		stringList.add("Evan");
		stringList.add(0, "Ugur");

		for(int index = 0; index < stringList.size(); index++){
			System.out.println(stringList.get(index));
		}

		if(stringList.contains("Greg")) {
			System.out.println("We found Greg");
		} else {
			System.out.println("We need to add Greg");
		}

		int indexOfChristopher = stringList.indexOf("Christopher");
		stringList.remove(indexOfChristopher);
		// stringList.remove("Christopher");

		for(int index = 0; index < stringList.size(); index++){
			System.out.println(stringList.get(index));
		}

		String className = "orange";
		int indexOfAn = className.indexOf("an");
		System.out.println(className.substring(0,indexOfAn));
		System.out.println(className.substring(indexOfAn+2));

		List<String> stringList2 = new ArrayList<>();
		stringList2.add("Dane");
		stringList2.add("Abigail");
		stringList2.add("Brooke");
		stringList2.add("Zaki");

		System.out.println("*************************");

		// Hint 1: For below how to check that the list is long enough (size) that we can actually retrieve a value from it
		// Hint 2: How many times will we need to run through the for loop if stringList2 is larger? What if stringList is larger?

		for(int i = 0; i < stringList2.size(); i++){
			if(stringList.get(i) != null) {
				System.out.println(stringList.get(i));
			}
			if(stringList2.get(i) != null) {
				System.out.println(stringList2.get(i));
			}
		}


/*
		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
*/

	}

}
