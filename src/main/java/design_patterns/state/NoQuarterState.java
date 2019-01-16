package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class NoQuarterState implements State {

   GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
         System.out.println("你投入了硬币");
         gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你并没有投入硬币，不能退回硬币");
    }

    @Override
    public void tumCrank() {
        System.out.println("你未投币，按下曲柄无效");
    }

    @Override
    public void dispense() {
        System.out.println("未投币不能发放糖果");
    }
}
