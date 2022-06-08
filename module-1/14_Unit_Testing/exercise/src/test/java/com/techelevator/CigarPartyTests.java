package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
    @Test
    public void test_minimum() {
        //Arrange
        CigarParty cgp = new CigarParty();
        //Act
        boolean result = cgp.haveParty(40, true);
        //Assert
        Assert.assertEquals(true, result);

    }
    @Test
    public void test_minimum2() {
        //Arrange
        CigarParty cgp = new CigarParty();
        //Act
        boolean result = cgp.haveParty(40, false);
        //Assert
        Assert.assertEquals(true, result);

    }
    @Test
    public void test_max_weekday() {
        //Arrange
        CigarParty cgp = new CigarParty();
        //Act
        boolean result = cgp.haveParty(60, false);
        //Assert
        Assert.assertEquals(true, result);

    }
    @Test
    public void test_no_max_weekend() {
        //Arrange
        CigarParty cgp = new CigarParty();
        //Act
        boolean result = cgp.haveParty(6000, true);
        //Assert
        Assert.assertEquals(true, result);

    }
}
