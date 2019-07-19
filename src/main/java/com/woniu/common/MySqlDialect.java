package com.woniu.common;

public class MySqlDialect implements Dialect{

	@Override
	public String getLimitSql(String sql, int offset, int limit) {
		return sql + " limit" + offset + "," +limit;
	}

}
