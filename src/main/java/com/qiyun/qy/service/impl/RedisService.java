/*package qiYun.framework.service;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

@Service("redisService")
public class RedisService {
	
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    *//**
     * 批量删除对应的value
     * 
     * @param keys
     *//*
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    *//**
     * 批量删除key
     * 
     * @param pattern
     *//*
    public void removePattern(final String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    *//**
     * 删除对应的value
     * 
     * @param key
     *//*
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    *//**
     * 判断缓存中是否有对应的value
     * 
     * @param key
     * @return
     *//*
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }
    
    public Object get(final String key) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        Object result = operations.get(key);
        return result;
    }
    
    public Set<Object> getZSet(final String key, long start, long end) {
    	ZSetOperations<String, Object> operations = redisTemplate.opsForZSet();
    	Set<Object> objects = operations.range(key, start, end);
        return objects;
    }

    *//**
     * 写入缓存
     * 
     * @param key
     * @param value
     * @return
     *//*
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    *//**
     * 写入缓存
     * 
     * @param key
     * @param value
     * @return
     *//*
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
*/