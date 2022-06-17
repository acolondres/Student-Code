package com.techelevator;

public class Module1CodingAssessment {

	public static void main(String[] args) {


		//Instantiate an object, or objects, in main()/Main(), and use the objects to test your methods.
		FlowerShopOrder flower = new FlowerShopOrder("standard", 12);

		System.out.println("Your flower order bouquet type is " + flower.getBouquetType() + " with " + flower.getNumberOfRoses() +
				" roses. Your to = " + flower.getSubtotal());

	}

}
