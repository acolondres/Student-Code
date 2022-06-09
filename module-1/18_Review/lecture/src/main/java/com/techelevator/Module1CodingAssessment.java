package com.techelevator;

import java.math.BigDecimal;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieRental morbius2 = new MovieRental("Morbius 2: Electric Boogaloo", MovieRental.BluRay, true);

	}

	public BigDecimal getLateFee(int daysLate) {
		BigDecimal lateFee = new BigDecimal("0.00");
		if (daysLate == 0) {
			lateFee = new BigDecimal("0.00");
		} else if (daysLate == 1) {
			lateFee = new BigDecimal("1.99");
		} else if (daysLate == 2) {
			lateFee = new BigDecimal("3.99");
		} else if (daysLate >= 3) {
			lateFee = new BigDecimal("19.99");
		}
		return lateFee;
	}


}
