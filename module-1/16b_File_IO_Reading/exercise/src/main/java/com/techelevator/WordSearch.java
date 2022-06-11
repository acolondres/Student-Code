package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
			//----------------------------------
			Scanner in = new Scanner(System.in);

			//----------------------------------
			int flag = 0;
			int lineNumber = 0;

			//----------------------------------
			System.out.println("What is the fully qualified name of the file that should be searched?");
			String filename = in.nextLine();

			//----------------------------------
			System.out.println("What is the search word you are looking for?");
			String word = in.nextLine();

			//----------------------------------
			System.out.println("Should the search be case sensitive? (Y/N)");
			String choice = in.nextLine();
			if (choice.equals("N")) {
				word = word.toLowerCase();
				flag = 1;
			}
			//----------------------------------
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(filename));
				String line = reader.readLine();
				lineNumber++;
				while (line != null) {
					if (flag == 1) {
						String temp = line.toLowerCase();
						if (temp.contains(word)) {
							System.out.println(lineNumber + ")" + line);
						}
					}
					else {
						if (line.contains(word)) {
							System.out.println(lineNumber + ")" + line);
						}
					}
					line = reader.readLine();
					lineNumber++;
				}
				//----------------------------------
				reader.close();
				System.out.println("------End of results------");
			}
			//----------------------------------
			catch (IOException e) {
				System.out.println("Your file was invalid. Please try again.");
			}
		}
	}


