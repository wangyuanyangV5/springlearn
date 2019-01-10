package mybatis1.mapper;

import mybatis1.SqlSession.SqlSession;
import mybatis1.xml.TestXml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dell on 2019/1/10.
 */
public class MapperProxy<T> implements InvocationHandler {

	private final SqlSession sqlSession;
	private final Class<T> mapperInterface;

	public  MapperProxy(SqlSession sqlSession, Class<T> type) {
		this.sqlSession = sqlSession;
		this.mapperInterface = type;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getDeclaringClass().getName().equals(mapperInterface.getName())){
			String sql = new TestXml("mybatis1.mapperinterface.Test").getSql(method.getName());
			String parameter = String.valueOf(args[0]);
			return sqlSession.selectOne(sql,parameter);
		}
		return null;
	}
}
