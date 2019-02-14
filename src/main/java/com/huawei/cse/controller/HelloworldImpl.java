package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-02-14T11:40:14.068Z")

@RestSchema(schemaId = "helloworld")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class HelloworldImpl {

    @Autowired
    private HelloworldDelegate userHelloworldDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloworldDelegate.helloworld(name);
    }

}
