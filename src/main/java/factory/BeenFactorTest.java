package factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2018/12/4.
 */
public class BeenFactorTest {
	@Autowired
	private static Student student;
	public static void main(String[] args){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
//		Student student = (Student) classPathXmlApplicationContext.getBean("Student");
		System.out.println(student);

	}

}
