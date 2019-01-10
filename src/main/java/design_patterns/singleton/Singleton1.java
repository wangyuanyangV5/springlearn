package design_patterns.singleton;

/**
 * Created by dell on 2019/1/2.
 */
public class Singleton1 {

	private Singleton1(){

	}

	private volatile static Singleton1 singleton1;


	public static Singleton1 getSingleton1(){
		if(singleton1 == null){
			synchronized (Singleton1.class){
				if(singleton1 == null){
					singleton1 = new Singleton1();
				}
			}
		}
		return singleton1;
	}

}
