package com.example.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld11";
    }
}
