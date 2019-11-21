package com.qf.springboot1116.controller;

import com.qf.springboot1116.properties.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private Person person;
    @RequestMapping("/test22")
    public String test1(){
       // String user = name+age+address;
        return "Hello,SpringBoot!"+"姓名"+person.getAname()+"年龄"+person.getAge()+"地址"+person.getAddress();
    }
}
