package org.example.ServiceTest;

import org.example.Services.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    //test method add

    @Test// imp
    public void addTest(){
        int result = Calculator.add(12, 13);

        int expected = 25;

        Assert.assertEquals(expected, result);
        // actual res


        // expected res
    }

    @Test// imp
    public void sumOfNumbersTest(){
        int result = Calculator.sumOfNumbers(1,2,3,4,5,6);

        int expected = 21;

        Assert.assertEquals(expected, result);

    }
}
