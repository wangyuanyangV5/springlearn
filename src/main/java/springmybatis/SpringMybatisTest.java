package springmybatis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springmybatis.config.ConfigBean;
import springmybatis.service.SumService;

/**
 * Created by dell on 2019/1/17.
 */
public class SpringMybatisTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        applicationContext.getBean(SumService.class).test();
        applicationContext.getBean(SumService.class).testTransactional();
    }
}
