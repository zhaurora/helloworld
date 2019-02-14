package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHelloworld {

        HelloworldDelegate helloworldDelegate = new HelloworldDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = helloworldDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}