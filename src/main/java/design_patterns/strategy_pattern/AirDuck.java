package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 */
public class AirDuck extends Duck {

	public AirDuck(){
		this.setFly(new AirFly());
	}

	@Override
	public void preform() {

	}
}
