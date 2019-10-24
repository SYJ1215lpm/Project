package com.syj.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController

@Api(value = "测试springboot集成Swagger",tags = "springboot集成Swagger")
public class TestController {
    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    @ApiOperation(value = "测试swagger2",httpMethod = "GET",response = String.class,notes = "接口发布说明")
    public String testController(){
        return "testController";
    }
}
