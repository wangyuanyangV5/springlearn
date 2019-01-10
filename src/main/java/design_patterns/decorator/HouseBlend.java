package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
