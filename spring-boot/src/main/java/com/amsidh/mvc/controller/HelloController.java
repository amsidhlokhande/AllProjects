package com.amsidh.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
    @RequestMapping(value="/hello")
    public String hello(){
        return "!Hello world from docker container world!";
    }
}
