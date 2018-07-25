package com.example.model;

import lombok.Data;

import java.io.Serializable;

/**
 * spring_boot_test
 * @author
 */
@Data
public class SpringBootModel implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}