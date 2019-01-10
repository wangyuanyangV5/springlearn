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
		log.info("+++++++++before+++++++++");
	}

	public void after(){
		log.info("+++++++++after+++++++++");
	}

	public void afterReturn(){
		log.info("+++++++++afterReturn+++++++++");
	}

	public void afterThrow(){
		log.info("+++++++++afterThrow+++++++++");
	}

	public Object around(ProceedingJoinPoint pJoinPoint)throws Throwable{
		log.info("+++++++++around+++++++++");
		Object ob = pJoinPoint.proceed();
		return pJoinPoint.proceed();
	}

}
