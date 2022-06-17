package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

    @Test
    public void test_echeck_calculation() {
        //arrange
        Car car1 = new Car(1992, "Toyota Paseo", true);

        //act
        boolean result = car1.needsECheck(1992);
        //assert
        Assert.assertEquals(false, result);
    }

    // I dont understand the difference between age and echeck calc. sorry

}
