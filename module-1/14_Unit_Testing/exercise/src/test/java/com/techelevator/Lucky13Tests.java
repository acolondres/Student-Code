package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void allunluckytest() {
        //Arrange
        Lucky13 l13 = new Lucky13();
        //Act
        var result = l13.getLucky(new int[]{3, 3, 3});
        //Assert
        Assert.assertEquals(false, result);
    }

    @Test
    public void alllucky() {
        //Arrange
        Lucky13 l13 = new Lucky13();
        //Act
        var result = l13.getLucky(new int[]{7, 7, 7});
        //Assert
        Assert.assertEquals(true, result);
    }

    @Test
    public void emptyarray() {
        //Arrange
        Lucky13 l13 = new Lucky13();
        //Act
        var result = l13.getLucky(new int[]{});
        //Assert
        Assert.assertEquals(true, result);
    }
    @Test
    public void luckywithunluckyinside() {
        //Arrange
        Lucky13 l13 = new Lucky13();
        //Act
        var result = l13.getLucky(new int[]{43, 13, 31});
        //Assert
        Assert.assertEquals(true, result);
    }



}
