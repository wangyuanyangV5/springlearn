package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

/**
 * Created by dell on 2019/1/10.
 */
public class AopTest1 {
	private static Logger log = LoggerFactory.getLogger(AopTest1.class);

	public void before(){
		log.info("+++++++++before...........1+++++++++");
	}

	public void after(){
		log.info("+++++++++after...........1+++++++++");
	}

	public void afterReturn(){
		log.info("+++++++++afterReturn..........1+++++++++");
	}

	public void afterThrow(){
		log.info("+++++++++afterThrow...........1+++++++++");
	}

	public Object around(ProceedingJoinPoint pJoinPoint)throws Throwable{
		log.info("+++++++++around...........1+++++++++");
		Object ob = pJoinPoint.proceed();
		return ob;
	}
}
