package com.loong.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello() {
        String version = System.getProperty("java.version");
        String jdkVeersion = System.getProperty("java.specification.version");
        return version + "\t" + jdkVeersion + "\t" + "hello spring boot!";
    }

}
