package com.thetestingacademy.ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class APITesting026_TestNG_Assertions {
    @Test(enabled = false)
    public void test_hardAssertExample() {
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("pramod","Pramod");
        System.out.println("End of the program");

    }

    // Software Assertion

    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Pramod","Pramod");
        System.out.println("End of program");
        softAssert.assertAll();
    }
}
