package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 */
public class Test {

	public static void main(String[] args){
		Duck air = new AirDuck();
		Duck rocket = new RocketDuck();
		air.fly();
		rocket.fly();
	}

}
