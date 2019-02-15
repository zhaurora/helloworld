package com.huawei.cse.controller;

import org.springframework.stereotype.Component;


@Component
public class HelloworldDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return "hi, " + name;
    }
}
