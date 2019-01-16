package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("该状态不能投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("该状态不能退币");
    }

    @Override
    public void tumCrank() {
        System.out.println("该状态不能按下曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("你被评为幸运用户，奖励一个糖果");
        gumballMachine.releaseBall();
        if(gumballMachine.getCounter() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCounter() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
                System.out.println("糖果已发放，请及时取出");
            }else {
                System.out.println("Oops,out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
