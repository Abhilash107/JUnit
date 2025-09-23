package org.example.ServiceTest;

import org.example.Services.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTestJunit5 {


    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before each: ");
    }


    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic:  ");
    }

    @Test
    @Tag("addition")
    public void addTest(){
        System.out.println("Test for addTest");

        int actualtResult = Calculator.add(12, 13);

        int expectedResult = 25;

        //Assertions.assertEquals(expectedResult, actualtResult);
        //with failed msg
        Assertions.assertEquals(expectedResult, actualtResult, "Test failed");


    }

    @Test
    @DisplayName("Custom name")
    //@Disabled
    @Tag("sum")
    public void sumOfNumbersTest(){
        System.out.println("Test for sumOfNumbersTest");
        int result = Calculator.sumOfNumbers(1,2,3,4,5,6);

        int expected = 21;

        Assertions.assertEquals(expected, result);

    }

    @Nested
    @Tag("nestedGroup")
    class NestedTests {
        @Test
        public void nestedTestExample(){
            System.out.println("Inside a nested test method");
            Assertions.assertTrue(true);
        }
    }



    @AfterEach
    public void afterTestCase(){
        System.out.println("After each:\n");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("done");
    }
}
