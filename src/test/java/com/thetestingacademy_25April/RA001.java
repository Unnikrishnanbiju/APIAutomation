package com.thetestingacademy_25April;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RA001 {

    //TestNG concepts

    //Steps

    //prepare a request - Given
    //make a request - When
    //verify the request - Then()
     @BeforeMethod
     void demo4(){
          System.out.println("BeforeMethod");
     }

     @Test
     void test1(){
          System.out.println("Test #1");
     }

     @Test
     void test2(){
          System.out.println("Test #2");
     }
     @AfterMethod
     void demo5(){
          System.out.println("AftreMethod");
     }

}
