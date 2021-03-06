package springmybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springmybatis.service.SumService;
import springmybatis.typehandler.EnumTypeHandler;

import javax.sql.DataSource;

/**
 * Created by dell on 2019/1/17.
 */
@Configuration
@MapperScan(basePackages = "springmybatis.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy= true)
public class ConfigBean {

    @Bean
    public SumService sumService(){
        return new SumService();
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
                .getResources("classpath:springmybatisxml/*.xml"));
        TypeHandler<?>[] typeHandlers = new TypeHandler[1];
        typeHandlers[0] = new EnumTypeHandler();
        sqlSessionFactoryBean.setTypeHandlers(typeHandlers );;
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager dataSourceTransactionManager(DataSource dataSource){
        return new  DataSourceTransactionManager(dataSource);
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
