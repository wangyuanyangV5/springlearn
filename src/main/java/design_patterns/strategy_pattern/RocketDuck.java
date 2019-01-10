package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 */
public class RocketDuck extends Duck {

	public RocketDuck(){
		setFly(new RocketFly());
	}

	@Override
	public void preform() {

	}
}
