package com.example.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bean")
public class HelloBean {
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
