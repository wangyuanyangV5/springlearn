import factory.Student;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dell on 2018/12/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Student.class)
public class BeenFactorTest {

	Logger log = LoggerFactory.getLogger(BeenFactorTest.class);

	@Autowired
	private Student student;

	@org.junit.Test
	public void test(){
		log.info(student.getAge() +"");
	}
}
