package org.example.ServiceTest;

import org.example.Services.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTestJunit5 {

    @Test
    public void addTest(){
        System.out.println("Test for addTest");

        int actualtResult = Calculator.add(12, 13);

        int expectedResult = 25;

        //Assertions.assertEquals(expectedResult, actualtResult);
        //with failed msg
        Assertions.assertEquals(expectedResult, actualtResult, "Test failed");


    }


    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic:  ");
    }

    @Test
    public void sumOfNumbersTest(){
        System.out.println("Test for sumOfNumbersTest");
        int result = Calculator.sumOfNumbers(1,2,3,4,5,6);

        int expected = 21;

        Assertions.assertEquals(expected, result);

    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("done");
    }
}
