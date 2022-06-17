package com.techelevator;

public class FlowerShopOrder {

    //bouquet type: indicates the type of bouquet.--------------------------------------------------------
    private String bouquetType;

    //number of roses: indicates the number of roses added to the bouquet---------------------------------
    private int numberOfRoses;

    //subtotal: indicates the order subtotal before shipping by adding $19.99 for the standard bouquet,---
    // plus $2.99 for each rose.--------------------------------------------------------------------------
    public double getSubtotal() {
        double subtotal = 19.99 + (numberOfRoses * 2.99);
        return subtotal;
    }

    //CONSTRUCTOR-------------------------------------------------------------------------------------------
    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    //getters and setters-----------------------------------------------------------------------------------
    public String getBouquetType() {
        return this.bouquetType;
    }

    public void setBouquetType(String bouquetType) {
        this.bouquetType = bouquetType;
    }

    public int getNumberOfRoses() {
        return this.numberOfRoses;
    }

    public void setNumberOfRoses(int numberOfRoses) {
        this.numberOfRoses = numberOfRoses;
    }

    // Create a method that calculates the delivery total
    // using input parameters of a bool/boolean for sameDayDelivery and a string zipCode:
    public boolean isSameDayDelivery(String zipCode) {

        // The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
        if (zipCode.startsWith("2")) {
            return true;
        }
        // The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
        else if (zipCode.startsWith("3")) {
            return true;
        }
        // The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999.
        else if (zipCode.startsWith("1")) {
            return true;
        }
        // All other zip codes cost $19.99 (same-day delivery is not an option).
        return false;
    }



    @Override
    public String toString() {
        return "ORDER - " + bouquetType + " - " + numberOfRoses + " roses - " + getSubtotal();
    }









}
