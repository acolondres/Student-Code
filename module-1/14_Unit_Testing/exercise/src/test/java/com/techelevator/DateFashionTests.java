package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {
    @Test
    public void test_style_both_0() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(0, 0);
        //Assert
        Assert.assertEquals(0, result);

    }
    @Test
    public void test_style_both_10() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(10, 10);
        //Assert
        Assert.assertEquals(2, result);

    }
    @Test
    public void test_style_0_and_10() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(10, 0);
        //Assert
        Assert.assertEquals(0, result);

    }
    @Test
    public void test_style_3_10() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(10, 3);
        //Assert
        Assert.assertEquals(2, result);

    }
    @Test
    public void test_style_7_3() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(7, 3);
        //Assert
        Assert.assertEquals(1, result);

    }
    @Test
    public void test_style_outbounds() {
        //Arrange
        DateFashion dtf = new DateFashion();
        //Act
        int result = dtf.getATable(20, -11);
        //Assert
        Assert.assertEquals(0, result);

    }


}
