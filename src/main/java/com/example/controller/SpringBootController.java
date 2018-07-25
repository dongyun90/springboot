package com.example.controller;

import com.example.model.HelloBean;
import com.example.model.SpringBootModel;
import com.example.service.SpringBootService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringBootController {

//    @Value("${school}")
//    private String school;
//    @Value("institute")
//    private String institute;
//    @Value("${study}")
//    private String study;

    @Autowired
    @Setter
    @Getter
    private HelloBean helloBean;

    @Autowired
    private SpringBootService springBootService;

    @RequestMapping("/hello")
    public HelloBean hello(@RequestParam(name = "age", defaultValue = "33") Integer a) {
        return helloBean;
    }

    @RequestMapping("/getAllTest")
    public List<SpringBootModel> getAllTest() {
        return springBootService.getAllTests();
    }

    @RequestMapping("/selectByPrimaryKey")
    public List<SpringBootModel> selectByPrimaryKey(@RequestParam(name = "springId", defaultValue = "0") Integer id) {
        return springBootService.selectByPrimaryKey(id);
    }

    @RequestMapping("/setValueFromRedis")
    public String setValueFromRedis(@RequestParam("key") String key, @RequestParam("value") String value) {
        return springBootService.setValueFromRedis(key, value);
    }

    @RequestMapping("/getValueFromRedis")
    public String getValueFromRedis(@RequestParam("key") String key) {
        return springBootService.getValueFromRedis(key);
    }
}
