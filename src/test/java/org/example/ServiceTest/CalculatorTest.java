//package org.example.ServiceTest;
//
//import org.example.Services.Calculator;
//import org.junit.*;
//
//import javax.xml.crypto.Data;
//import java.util.Date;
//
//public class CalculatorTest {
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases: ");
//        System.out.println("Started tests: "+ new Date());
//        System.out.println();
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test case:");
//
//    }
//
//
//    //test methods add
//    @Test// imp
//    public void addTest(){
//        System.out.println("Test for addTest");
//        int result = Calculator.add(12, 13);
//
//        int expected = 25;
//
//        Assert.assertEquals(expected, result);
//        // actual res
//
//
//        // expected res
//    }
//
//    //@Test// imp
//    @Test(timeout = 2000)
//    public void sumOfNumbersTest(){
//        System.out.println("Test for sumOfNumbersTest");
//        int result = Calculator.sumOfNumbers(1,2,3,4,5,6);
//
//        int expected = 21;
//
//        Assert.assertEquals(expected, result);
//
//    }
//
//    @After
//    public void afterEach(){
//        System.out.println("After each test case:\n");
//
//    }
//
//    @AfterClass
//    public static void cleanUp(){
//        System.out.println("After all test case:");
//        System.out.println("End test cases : "+ new Date());
//    }
//}
