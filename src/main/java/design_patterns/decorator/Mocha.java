package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public class Mocha extends CondimentDecorator{

	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ";Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
}
