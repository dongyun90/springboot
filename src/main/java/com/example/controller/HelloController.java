package com.example.controller;

import com.example.mapper.SpringBootTestMapper;
import com.example.model.HelloBean;
import com.example.model.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
//    @Component
//    @ConfigurationProperties(prefix = "bean")
//    class HelloBean {
//        private String school;
//        private String institute;
//        private String study;
//
//        public String getSchool() {
//            return school;
//        }
//
//        public void setSchool(String school) {
//            this.school = school;
//        }
//
//        public String getInstitute() {
//            return institute;
//        }
//
//        public void setInstitute(String institute) {
//            this.institute = institute;
//        }
//
//        public String getStudy() {
//            return study;
//        }
//
//        public void setStudy(String study) {
//            this.study = study;
//        }
//
//        @Override
//        public String toString() {
//            return "HelloBean{" +
//                    "school='" + school + '\'' +
//                    ", institute='" + institute + '\'' +
//                    ", study='" + study + '\'' +
//                    '}';
//        }
//    }

//    @Value("${school}")
//    private String school;
//    @Value("institute")
//    private String institute;
//    @Value("${study}")
//    private String study;

    @Autowired
    private HelloBean helloBean;

    @Autowired
    private SpringBootTestMapper mapper;

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "age", defaultValue = "33") Integer a) {
        return helloBean.toString();
    }

    @RequestMapping("/getAllTest")
    public List<SpringBootTest> getAllTest() {
        return mapper.getAllTests();
    }
}
