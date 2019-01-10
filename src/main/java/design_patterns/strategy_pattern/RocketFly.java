package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 */
public class RocketFly implements Fly {
	@Override
	public void playFly() {
		System.out.println("乘火箭飞行");
	}
}
