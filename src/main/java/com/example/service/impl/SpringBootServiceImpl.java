package com.example.service.impl;

import com.example.mapper.SpringBootMapper;
import com.example.model.SpringBootModel;
import com.example.service.SpringBootService;
import com.example.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

@Service
public class SpringBootServiceImpl implements SpringBootService {
    @Autowired
    private SpringBootMapper springBootMapper;
    @Autowired
    private RedisConfig redisConfig;

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
        Jedis jedis = redisConfig.getJedisPool().getResource();
        try {
            //return value by key from redis
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return null;
    }

    @Override
    public String setValueFromRedis(String key, String value) {
        Jedis jedis = redisConfig.getJedisPool().getResource();
        try {
            //return status code from redis
            return jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return null;
    }

}
