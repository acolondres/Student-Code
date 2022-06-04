package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void test_giraffe_returns_tower() {
        //Arrange
        AnimalGroupName agn = new AnimalGroupName();
        //Act
        String result = agn.getHerd("giraffe");
        //Assert
        Assert.assertEquals("Tower", result);
    }
    @Test
    public void test_bigfoot_returns_unkown() {
        //Arrange
        AnimalGroupName agn = new AnimalGroupName();
        //Act
        String result = agn.getHerd("bigfoot");
        //Assert
        Assert.assertEquals("unknown", result);
    }
    @Test
    public void test_null_returns_unknown() {
        //Arrange
        AnimalGroupName agn = new AnimalGroupName();
        //Act
        String result = agn.getHerd(null);
        //Assert
        Assert.assertEquals("unknown", result);
    }
    @Test
    public void test_empty_returns_unkown() {
        //Arrange
        AnimalGroupName agn = new AnimalGroupName();
        //Act
        String result = agn.getHerd("");
        //Assert
        Assert.assertEquals("unknown", result);
    }
    @Test
    public void test_gIrAffE_returns_tower() {
        //Arrange
        AnimalGroupName agn = new AnimalGroupName();
        //Act
        String result = agn.getHerd("gIrAffE");
        //Assert
        Assert.assertEquals("Tower", result);
    }
}

