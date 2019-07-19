package com.woniu.common;

public class MyOracleDialect implements Dialect {

	@Override
	public String getLimitSql(String sql, int offset, int limit) {
		String newSqlString = "select * from " + 
				"	(select a.*,rownum rn from ("+sql+") a where rn<"+(offset+limit)+") t" + 
				"	where t.rn>"+offset;
		return newSqlString;
	}

}
