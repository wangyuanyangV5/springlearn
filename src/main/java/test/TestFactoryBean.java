package test;

import config.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2018/12/23.
 */
public class TestFactoryBean {

	public static void main(String[] args){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBean.class);
		applicationContext.getBean("wangFactoryBean");
		applicationContext.getBean("wangFactoryBean");
	}

}
