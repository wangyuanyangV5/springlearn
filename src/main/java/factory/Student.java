package factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2018/12/4.
 */
@Component
public class Student {
	private int age;
	private String name;
	private static Logger log = LoggerFactory.getLogger(Student.class);
	public Student(){
        name = "test";
        age = 12;
	}
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Student1
	@Student2
	public String getName() {
		log.info(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
