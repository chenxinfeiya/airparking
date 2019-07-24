package com.woniu.cache;

import java.util.concurrent.TimeUnit;

import org.apache.ibatis.cache.Cache;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.woniu.ApplicationContextHolder;

//@Service
public class MyRedisCache implements Cache{
	private String id;
	
	private RedisTemplate<Object, Object> redisTemplate;
	@Override
	public String getId() {
		return id;
	}
	
	public MyRedisCache(final String id) {
		if(id == null) {
			throw new RuntimeException("null id is exception");
		}
		this.id = id;
		redisTemplate = (RedisTemplate<Object, Object>) ApplicationContextHolder.getBean("redisTemplate");
	}
	@Override
	public void putObject(Object key, Object value) {
		redisTemplate.opsForValue().set(key, value);
		
	}

	@Override
	public Object getObject(Object key) {
		// TODO Auto-generated method stub
		return redisTemplate.opsForValue().get(key);
	}

	@Override
	public Object removeObject(Object key) {
		// TODO Auto-generated method stub
		return redisTemplate.delete(key);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		redisTemplate.execute(new RedisCallback() {

			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushDb();
				return null;
			}
		});
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public void set(String key, String value, int timeout) {
	        ValueOperations<Object, Object> operations = redisTemplate.opsForValue();
	        operations.set(key,value,timeout,TimeUnit.MINUTES);
	    }


}
