package design_patterns.singleton;

/**
 * Created by dell on 2019/1/2.
 * 单例模式
 */
public class Test {

	public static void main(String[] arga){
		Singleton1 singleton1 = Singleton1.getSingleton1();
		Singleton1 singleton11 = Singleton1.getSingleton1();
		System.out.println("singleton1 == singleton11:" + (singleton1 == singleton11));
		Singleton2 singleton2 = Singleton2.getSingleton2();
		Singleton2 singleton21 = Singleton2.getSingleton2();
		System.out.println("singleton2 == singleton21:" + (singleton2 == singleton21));
	}

}
