package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 */
public abstract class Beverage {

	protected String description;

	public String getDescription(){
		return description;
	}

	public abstract double cost();

}
