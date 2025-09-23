package org.example.ServiceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AssertEx {


    //Assertion -> Assertion is a condition or statement that should be true

    @Test
    public void test1(){
        System.out.println("Testing some assertions methods");
        //Overloaded methods

        //double actual = 12, expected = 12;
        //Assertions.assertEquals(expected, actual);

//        float a = 10;
//        Float b = 10f;
        //Assertions.assertEquals(a, b);

//        Assertions.assertArrayEquals(new int[]{1,2}, new int[]{1, 1,2});//failed
//        Assertions.assertArrayEquals(new int[]{1,2}, new int[]{1,2});//passed

//        String name = new String("ABC");
//        String expectedName = new String("ABC");

        //Assertions.assertSame(expectedName, name);//fails as refers to diff objects
        //Assertions.assertEquals(expectedName, name);//passed

        String name = "ABC";
        String expectedName = "ABC";
        Assertions.assertEquals(expectedName, name);//passed
        Assertions.assertSame(expectedName, name);//passed

        //Assertions.assertNotNull(null);//fails

        //Assertions.assertTrue(false);//fails

        Assertions.assertIterableEquals(Arrays.asList(1,2,6), Arrays.asList(1,2,6));
        //Assertions.assertIterableEquals(Arrays.asList(1,2), Arrays.asList(1,2,6));//fails
        //checking by order
        Assertions.assertIterableEquals(Arrays.asList(1,2,3), Arrays.asList(1,3,2));//fails






    }


}
