package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

/**
 * Created by dell on 2018/12/14.
 */
public class AopTest{

	private static Logger log = LoggerFactory.getLogger(AopTest.class);

	public void before(){
		log.info("+++++++++before00000000000000000+++++++++");
	}

	public void after(){
		log.info("+++++++++after00000000000000+++++++++");
	}

	public void afterReturn(){
		log.info("+++++++++afterReturn0000000000+++++++++");
	}

	public void afterThrow(){
		log.info("+++++++++afterThrow00000000000+++++++++");
	}

	public Object around(ProceedingJoinPoint pJoinPoint)throws Throwable{
		log.info("+++++++++around++++++++0000000000000000+");
		Object ob = pJoinPoint.proceed();
		return ob;
	}

}
