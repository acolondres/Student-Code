package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    @Test
    public void all_same() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        //Act
        var result = maxEnd.makeArray(new int[]{7, 7, 7});
        //Assert
        Assert.assertArrayEquals(new int[]{7, 7, 7}, result);
    }

    @Test
    public void all_0() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        //Act
        var result = maxEnd.makeArray(new int[]{0, 0, 0});
        //Assert
        Assert.assertArrayEquals(new int[]{0, 0, 0}, result);
    }
    @Test
    public void array_of_2_ints() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        //Act
        var result = maxEnd.makeArray(new int[]{7, 7});
        //Assert
        Assert.assertArrayEquals(new int[]{7, 7}, result);
    }

}
