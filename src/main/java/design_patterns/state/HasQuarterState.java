package design_patterns.state;

import java.util.Random;

/**
 * Created by dell on 2019/1/15.
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已投币，不需要重复投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void tumCrank() {
        System.out.println("按下曲柄，即将发糖果");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCounter() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("糖果未发放，还不能取出");
    }
}
