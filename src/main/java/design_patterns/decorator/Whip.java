package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ";Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.5;
	}
}
