package design_patterns.singleton;

/**
 * Created by dell on 2019/1/2.
 */
public class Singleton2 {

	private static Singleton2  singleton2 = new Singleton2();

	private Singleton2(){

	}

	public static Singleton2 getSingleton2(){
		return singleton2;
	}
}
