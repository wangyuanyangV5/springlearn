import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dell on 2019/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CircleTest {
	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleByConstructor() throws Throwable {
		try {
			new ClassPathXmlApplicationContext("classpath:applicationContextCircle.xml");
		}
		catch (Exception e) {
			//因为要在创建circle3时抛出；
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}
}
