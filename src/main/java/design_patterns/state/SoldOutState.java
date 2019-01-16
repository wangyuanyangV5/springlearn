package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已无糖果，你不能投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你不能退币，你并没有投入硬币");
    }

    @Override
    public void tumCrank() {
        System.out.println("按下曲柄无效，已售罄");
    }

    @Override
    public void dispense() {
        System.out.println("在售罄情况下不能出糖果");
    }
}
