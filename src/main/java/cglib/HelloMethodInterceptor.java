package cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by dell on 2019/1/7.
 */
public class HelloMethodInterceptor implements MethodInterceptor {
	private Logger log = LoggerFactory.getLogger(HelloMethodInterceptor.class);
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		log.error("before:" + method.getName());
		Object object = methodProxy.invokeSuper(o,objects);
		log.error("After:" + method.getName());
		return object;
	}
}
