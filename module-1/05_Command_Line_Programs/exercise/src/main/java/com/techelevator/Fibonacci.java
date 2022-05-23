package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		//make input possible
		Scanner console = new Scanner(System.in);

		//ask user to input their "integer" and store it
		System.out.println("Enter an integer: ");
		int n = console.nextInt();

		// 'if' statement + formula from
		if (n > 1) {
			System.out.println("The Fibonacci sequence up to " + n + " are: ");
			System.out.print("1, 1, ");
			//formula here credit to "stackflowed" on stackoverflow(dot)com
			int f2 = 1;
			int fibonacci = 1;
			for (int i = 1; i + f2 <= n; ) {
				fibonacci = i + f2;
				i = f2;
				f2 = fibonacci;
				System.out.print(fibonacci + ", ");

			}
			// if continued to show other circumstances of (0 or neg. num / 1)
		} if (n == 1) {
			System.out.println("0, 1, 1");
		} else if (n <= 0) {
			System.out.println("0, 1");


			}
		}




	}



