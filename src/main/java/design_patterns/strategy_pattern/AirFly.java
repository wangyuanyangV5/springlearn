package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 */
public class AirFly implements Fly {
	@Override
	public void playFly() {
		System.out.println("乘飞机飞行");
	}
}
