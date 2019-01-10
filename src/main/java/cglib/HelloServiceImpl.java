package cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dell on 2019/1/7.
 */
public class HelloServiceImpl {

	private Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

	public void sayHello(){
		log.error("hello");
	}

}
