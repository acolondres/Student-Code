package com.techelevator;

public class Module1CodingAssessment {

	public static void main(String[] args) {

		/*
		System.out.println("Please select which format (enter number):");
		System.out.println("1. VHS");
		System.out.println("2. DVD");
		System.out.println("3. Blu Ray");

		if(input.equals("1")) {
			format = MovieRental.VHS
		} */


		MovieRental movie = new MovieRental("Morbius", MovieRental.BLURAY, true);
		System.out.println(movie.getTitle());
		System.out.println(movie.getFormat());
		System.out.println(movie.isPremium());
		System.out.println(movie.getRentalPrice());

		System.out.println(movie);
	}

}
