package cglib;


import net.sf.cglib.proxy.Enhancer;

/**
 * Created by dell on 2019/1/7.
 */
public class Test {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(HelloServiceImpl.class);
		enhancer.setCallback(new HelloMethodInterceptor());
		HelloServiceImpl helloService = (HelloServiceImpl)enhancer.create();
		helloService.sayHello();
	}
}
