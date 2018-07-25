package com.example.service;

import com.example.model.SpringBootModel;

import java.util.List;

public interface SpringBootService {
    List<SpringBootModel> getAllTests();

    List<SpringBootModel> selectByPrimaryKey(Integer id);

    String getValueFromRedis(String key);

    String setValueFromRedis(String key, String value);
}
