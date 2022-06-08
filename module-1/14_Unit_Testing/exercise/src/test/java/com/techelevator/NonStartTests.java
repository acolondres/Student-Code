package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void length_1() {
        //Arrange
        NonStart nonS = new NonStart();
        //Act
        var result = nonS.getPartialString("A", "A");

        //Assert
        Assert.assertEquals("", result);
    }
    @Test
    public void using_int() {
        //Arrange
        NonStart nonS = new NonStart();
        //Act
        var result = nonS.getPartialString("8888", "9999");

        //Assert
        Assert.assertEquals("888999", result);
    }
}
