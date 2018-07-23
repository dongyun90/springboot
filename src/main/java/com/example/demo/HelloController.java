package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @Component
    @ConfigurationProperties(prefix = "bean")
    class HelloBean {
        private String school;
        private String institute;
        private String study;

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getInstitute() {
            return institute;
        }

        public void setInstitute(String institute) {
            this.institute = institute;
        }

        public String getStudy() {
            return study;
        }

        public void setStudy(String study) {
            this.study = study;
        }

        @Override
        public String toString() {
            return "HelloBean{" +
                    "school='" + school + '\'' +
                    ", institute='" + institute + '\'' +
                    ", study='" + study + '\'' +
                    '}';
        }
    }

//    @Value("${school}")
//    private String school;
//    @Value("institute")
//    private String institute;
//    @Value("${study}")
//    private String study;

    @Autowired
    private HelloBean helloBean;

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "age", defaultValue = "33") Integer a) {
        return helloBean.toString();
    }
}
