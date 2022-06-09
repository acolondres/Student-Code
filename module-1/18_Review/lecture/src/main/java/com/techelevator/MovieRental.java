package com.techelevator;

import java.math.BigDecimal;

public class MovieRental {

    //create some constants to re-use----------------
    public static final String VHS = "VHS";
    public static final String DVD= "DVD";
    public static final String BluRay = "BluRay";
    //------------------------------------------------

    private String title;
    private String format;
    private boolean isPremiumMovie;

    // Getters-------------------------------------
    public String getTitle() {
        return title;
    }
    public String getFormat() {
        return format;
    }
    public boolean isPremium() {
        return isPremiumMovie;
    }
    //--------------------------------------------

    public BigDecimal getRentalPrice() {
        BigDecimal price = new BigDecimal("0.00");

        if (format.equals(VHS)) {
            price = new BigDecimal("0.99");
        } else if (format.equals(DVD)) {
            price = new BigDecimal("1.99");
        } else if (format.equals(BluRay)) {
            price = new BigDecimal("2.99");
        }
        if (isPremiumMovie) {
            price = price.add(new BigDecimal("1.00"));
        }
        return price;
    }

    // Constructor----------------------------------

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
    }
    //----------------------------------------------



}
