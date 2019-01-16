package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
       System.out.println("请等待糖果发出后再次投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在发放糖果，不能退币");
    }

    @Override
    public void tumCrank() {
        System.out.println("糖果正在发放中，无需再次按曲柄");
    }

    @Override
    public synchronized void dispense() {
        gumballMachine.releaseBall();
        System.out.println("糖果已发放，请及时取出");
        if(gumballMachine.getCounter() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops,out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
