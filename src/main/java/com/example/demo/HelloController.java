package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "age", defaultValue = "33") Integer a) {
        return "hello world";
    }
}
