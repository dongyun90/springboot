package com.example.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello.bean")
@Data
public class HelloBean {
    private String school;
    private String institute;
    private String study;
}
