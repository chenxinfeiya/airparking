package com.woniu.common;

import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;

public class MyInterceptor implements Interceptor{

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
		MetaObject metaObject =MetaObject.forObject//
				 (statementHandler,new DefaultObjectFactory(),new DefaultObjectWrapperFactory(),new DefaultReflectorFactory());
		RowBounds rb = (RowBounds)metaObject.getValue("delegate.rowBounds");
		if(rb == null || rb == RowBounds.DEFAULT) {
			System.out.println("不需要分页...");
			Object proceed = invocation.proceed();
			return proceed;
		}else {
			System.out.println("需要分页...");
			String oldSql = (String)metaObject.getValue("delegate.boundSql.sql");
			int offset = rb.getOffset();
			int limit = rb.getLimit();
			Configuration configuration = (Configuration)metaObject.getValue("delegate.configuration");
			String type = configuration.getVariables().getProperty("dialect");
			Dialect dialect = createDialect(type);
			String finalSql = dialect.getLimitSql(oldSql, offset, limit);
			metaObject.setValue("delegate.boundSql.sql", finalSql);
			metaObject.setValue("delegate.rowBounds.offset",RowBounds.NO_ROW_OFFSET);
			metaObject.setValue("delegate.rowBounds.limit",RowBounds.NO_ROW_LIMIT);
			Object obj = invocation.proceed();
			return obj;
		}
	}
	
	public Dialect createDialect(String type) {
		if("mysql".equals(type)) {
			return new MySqlDialect();
		}else if("oracle".equals(type)) {
			return new MyOracleDialect();
		}else {
			throw new RuntimeException("not found dialect type...");
		}
	}
	
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}
	
	@Override
	public void setProperties(Properties properties) {
	}

}
