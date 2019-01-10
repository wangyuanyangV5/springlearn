package design_patterns.strategy_pattern;

/**
 * Created by dell on 2018/12/28.
 * 策略模式
 */
public abstract class Duck {

	private Fly fly;

	private int age;

	public abstract void preform();

	public  void fly(){
		fly.playFly();;
	}

	public int getAge(){
		return age;
	}

	protected void setFly(Fly fly) {
		this.fly = fly;
	}
}
