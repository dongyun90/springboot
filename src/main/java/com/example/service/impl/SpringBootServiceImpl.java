package com.example.service.impl;

import com.example.mapper.SpringBootMapper;
import com.example.model.SpringBootModel;
import com.example.service.SpringBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringBootServiceImpl implements SpringBootService {
    @Autowired
    private SpringBootMapper springBootMapper;

    @Override
    public List<SpringBootModel> getAllTests() {
        return springBootMapper.getAllTests();
    }

    @Override
    public List<SpringBootModel> selectByPrimaryKey(Integer id) {
        return springBootMapper.selectByPrimaryKey(id);
    }
}
