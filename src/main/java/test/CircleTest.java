package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2019/1/9.
 */
public class CircleTest {
	/**
	 * 循环依赖注入问题
	 * 1：AbstractBeanFactory中doGetBean方法中
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContextCircle.xml");
	}
}
