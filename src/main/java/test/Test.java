package test;

import factory.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2018/12/4.
 */
public class Test {

	private static Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args){
//		//定位，载入，注册
//		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(resource);

		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		log.info(student.getName());
		student.setName("test");
//
//		Test test = new Test();
//		log.error(test.getClass().getClassLoader() + "");
//		log.error(test.getClass().getClassLoader().getParent() + "");
//		log.error(test.getClass().getClassLoader().getParent().getParent() + "");
	}

}
