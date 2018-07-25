package com.example.service.impl;

import com.example.mapper.SpringBootMapper;
import com.example.model.SpringBootModel;
import com.example.service.SpringBootService;
import com.example.utils.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

@Service
public class SpringBootServiceImpl implements SpringBootService {
    @Autowired
    private SpringBootMapper springBootMapper;
    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public List<SpringBootModel> getAllTests() {
        return springBootMapper.getAllTests();
    }

    @Override
    public List<SpringBootModel> selectByPrimaryKey(Integer id) {
        return springBootMapper.selectByPrimaryKey(id);
    }

    @Override
    public String getValueFromRedis(String key) {
        return jedisUtil.get(key);
    }

    @Override
    public String setValueFromRedis(String key, String value) {
        return jedisUtil.set(key, value);
    }

}
