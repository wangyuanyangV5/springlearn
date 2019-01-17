package factory.factorybean;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import service.UserService;

import javax.sql.DataSource;


/**
 * Created by dell on 2018/12/23.
 */
@Configuration
@MapperScan(basePackages = {"com.mybatis.mapper"},sqlSessionFactoryRef = "sqlSessionFactory")
@EnableTransactionManagement
//@ComponentScan({"factory.factorybean"})
public class BeenDifine {

	@Bean
	public UserService userService(){
		return new UserService();
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
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:user/*.xml"));

		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
		return new  DataSourceTransactionManager(dataSource);
	}


//	@Bean
//	public PlatformTransactionManager txManager(DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
@Bean
public SqlSessionTemplate sqlSessionTemplate( SqlSessionFactory sqlSessionFactory) throws Exception {
	return new SqlSessionTemplate(sqlSessionFactory);
}

}
