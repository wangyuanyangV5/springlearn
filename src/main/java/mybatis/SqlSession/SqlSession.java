package mybatis.SqlSession;

import mybatis.Executor.Executor;
import mybatis.config.Configuration;
import mybatis.mapper.MapperProxy;

import java.lang.reflect.Proxy;

/**
 * Created by dell on 2019/1/10.
 */
public class SqlSession {

	private final Configuration configuration;

	private final Executor executor;


	public SqlSession(Configuration configuration, Executor executor) {
		this.configuration = configuration;
		this.executor = executor;
	}

	public <T> T getMapper(Class<T> type) {
		return (T)Proxy.newProxyInstance(type.getClassLoader(),new Class[]{type},new MapperProxy(this,type));
	}

	public <T> T selectOne(String statement, Object parameter) {
		return executor.query(statement,parameter);
	}


}
