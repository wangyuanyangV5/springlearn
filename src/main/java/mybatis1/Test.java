package mybatis1;

import mybatis1.Executor.DefaultExecutor;
import mybatis1.SqlSession.SqlSession;
import mybatis1.config.Configuration;

/**
 * Created by dell on 2019/1/10.
 */
public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		DefaultExecutor defaultExecutor = new DefaultExecutor();
		SqlSession sqlSession = new SqlSession(configuration,defaultExecutor);
		mybatis1.mapperinterface.Test test = sqlSession.getMapper(mybatis1.mapperinterface.Test.class);
		test.selectNameById("1");
	}
}
