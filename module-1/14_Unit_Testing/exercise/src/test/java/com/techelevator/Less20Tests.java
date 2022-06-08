package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {
    @Test
    public void edge_case_99() {
        //Arrange
        Less20 l20 = new Less20();
        //Act
        var result = l20.isLessThanMultipleOf20(99);
        //Assert
        Assert.assertEquals(true, result);
    }
    @Test
    public void edge_case_98() {
        //Arrange
        Less20 l20 = new Less20();
        //Act
        var result = l20.isLessThanMultipleOf20(98);
        //Assert
        Assert.assertEquals(true, result);
    }
    @Test
    public void edge_case_101() {
        //Arrange
        Less20 l20 = new Less20();
        //Act
        var result = l20.isLessThanMultipleOf20(101);
        //Assert
        Assert.assertEquals(false, result);
    }
    @Test
    public void edge_case_102() {
        //Arrange
        Less20 l20 = new Less20();
        //Act
        var result = l20.isLessThanMultipleOf20(102);
        //Assert
        Assert.assertEquals(false, result);
    }
    @Test
    public void less20_at1000() {
        //Arrange
        Less20 l20 = new Less20();
        //Act
        var result = l20.isLessThanMultipleOf20(1000);
        //Assert
        Assert.assertEquals(false, result);
    }
}
