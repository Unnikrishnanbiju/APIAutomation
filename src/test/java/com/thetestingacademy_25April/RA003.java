package com.thetestingacademy_25April;

import org.testng.annotations.Test;

public class RA003 {

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("T1 - smoke");
    }

    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("T2 - smoke");
    }

    @Test(groups = {"reg"})
    public void test3(){
        System.out.println("T3");
    }
}
