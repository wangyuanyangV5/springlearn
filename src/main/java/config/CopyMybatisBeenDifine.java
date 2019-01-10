package config;

import com.mybatis.copy.*;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import service.UserService;

import javax.sql.DataSource;


/**
 * Created by dell on 2018/12/23.
 */
@Configuration
@EnableMapper
public class CopyMybatisBeenDifine {

	@Bean
	public UserService userService(){
		return new UserService();
	}

	@Bean
	public MyApplicationAware getMyApplicationAware(){
		return new MyApplicationAware();
	}

	@Bean
	public BeanPostProcessorTest getBeanPostProcessorTest(){
		return new BeanPostProcessorTest();
	}

	@Bean
	public InitializingBeanTest getInitializingBeanTest(){
		return new InitializingBeanTest();
	}

	@Bean
	public BeanFactoryPostProcessor_1 getBeanFactoryPostProcessor_1(){
		return new BeanFactoryPostProcessor_1();
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("123456");
		return driverManagerDataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}


}
