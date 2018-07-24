package com.example.service;

import com.example.model.SpringBootModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpringBootService {
    List<SpringBootModel> getAllTests();

    SpringBootModel selectByPrimaryKey(Integer id);
}
