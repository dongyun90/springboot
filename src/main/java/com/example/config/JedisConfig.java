package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig {
    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        int database = redisProperties.getDatabase();
        String host = redisProperties.getHost();
        String password = redisProperties.getPassword();
        int port = redisProperties.getPort();
        int timeout = redisProperties.getTimeout();
        int maxIdle = redisProperties.getPool().getMaxIdle();
        int minIdle = redisProperties.getPool().getMinIdle();
        int maxWait = redisProperties.getPool().getMaxWait();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMinIdle(minIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWait);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password, database);
        return jedisPool;
    }
}
