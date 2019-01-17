package mybatis;

import mybatis.spring.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2019/1/10.
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//		Configuration configuration = new Configuration();
//		DefaultExecutor defaultExecutor = new DefaultExecutor();
//		SqlSession sqlSession = new SqlSession(configuration,defaultExecutor);
//		mybatis.mapperinterface.Test test = sqlSession.getMapper(mybatis.mapperinterface.Test.class);
//		test.selectNameById("1");
	}
}
