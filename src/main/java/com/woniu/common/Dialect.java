package com.woniu.common;

public interface Dialect {
	String getLimitSql(String sql,int offset,int limit);
}
