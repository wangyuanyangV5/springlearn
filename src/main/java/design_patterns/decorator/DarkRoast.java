package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "darkRoast";
	}

	@Override
	public double cost() {
		return 1.66;
	}
}
