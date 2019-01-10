package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public class Espresso extends Beverage {

	public Espresso(){
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
