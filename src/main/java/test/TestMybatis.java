package test;


import factory.factorybean.BeenDifine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.UserService;

/**
 * Created by dell on 2018/12/23.
 */
@EnableAspectJAutoProxy
public class TestMybatis {

	public static void main(String[] args) throws Exception{
//		String resource = "mybatis1.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		sqlSession.getConfiguration().addMapper(UsersMapper.class);
//		UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
//		System.out.println(usersMapper.selectAll());
//		System.out.println(usersMapper.selectAll());

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeenDifine.class);
//		applicationContext.getBean(UserService.class).test();
//		applicationContext.getBean(UserService.class).test();

	}

}
