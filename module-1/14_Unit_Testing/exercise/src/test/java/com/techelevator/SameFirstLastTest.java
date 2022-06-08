package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void length_1() {
        //Arrange
        SameFirstLast SFL = new SameFirstLast();
        //Act
        var result = SFL.isItTheSame(new int[] {1});

        //Assert
        Assert.assertEquals(true, result);
    }
    @Test
    public void length_all_equal() {
        //Arrange
        SameFirstLast SFL = new SameFirstLast();
        //Act
        var result = SFL.isItTheSame(new int[] {1, 1, 1, 1});

        //Assert
        Assert.assertEquals(true, result);
    }
}
