package com.woniu.cache;

import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;

import com.woniu.ApplicationContextHolder;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getObject(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeObject(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
