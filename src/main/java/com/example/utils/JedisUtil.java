package com.example.utils;

import com.example.config.JedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class JedisUtil {
    @Autowired
    private JedisConfig redisConfig;

    public String set(String key, String value) {
        Jedis jedis = redisConfig.getJedisPool().getResource();
        try {
            return jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return null;
    }

    public String get(String key) {
        Jedis jedis = redisConfig.getJedisPool().getResource();
        try {
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return null;
    }
}
