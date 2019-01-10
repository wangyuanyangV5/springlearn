package design_patterns.decorator;

/**
 * Created by dell on 2018/12/29.
 * 装饰器模式
 */
public class Test {

	public static void main(String[] args){
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "$"+ beverage.cost());
		Beverage beverage1 = new Mocha(beverage);
		System.out.println(beverage1.getDescription() + "$"+ beverage1.cost());
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + "$"+ beverage1.cost());
		beverage1 = new Whip(beverage1);
		System.out.println(beverage1.getDescription() + "$"+ beverage1.cost());
	}

}
