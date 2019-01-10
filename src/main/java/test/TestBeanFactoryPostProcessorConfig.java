package test;

import config.BeanFactoryPostProcessorConfig;
import config.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2018/12/23.
 */
public class TestBeanFactoryPostProcessorConfig {

	public static void main(String[] args){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		Object o = applicationContext.getBean("beanTmp");
	}

}
