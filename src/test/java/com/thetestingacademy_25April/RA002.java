package com.thetestingacademy_25April;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RA002 {

    @Test
    public void test4(){

        String name = "Unni";


        Assert.assertEquals("Unni",name, "Failed dueto mismatch");
        System.out.println("End");
    }
}
