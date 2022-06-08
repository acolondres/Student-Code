package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void test_1() {
        //Arrange
        FrontTimes fts = new FrontTimes();
        //Act
        var result = fts.generateString("Apple", 1);
        //Assert
        Assert.assertEquals("App", result);
    }
    @Test
    public void test_1_letter() {
        //Arrange
        FrontTimes fts = new FrontTimes();
        //Act
        var result = fts.generateString("A", 1);
        //Assert
        Assert.assertEquals("A", result);
    }
    @Test
    public void test_2_letter() {
        //Arrange
        FrontTimes fts = new FrontTimes();
        //Act
        var result = fts.generateString("Ab", 3);
        //Assert
        Assert.assertEquals("AbAbAb", result);
    }
    @Test
    public void test_neg_int() {
        //Arrange
        FrontTimes fts = new FrontTimes();
        //Act
        var result = fts.generateString("A", -1);
        //Assert
        Assert.assertEquals("", result);
    }







}
