package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class GumballMachine {

    State soldOutState;
    State  noQuarterState;
    State  hasQuarterState;
    State  soldState;
    State winnerState;

    State state = soldState;
    int counter = 0;

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public GumballMachine(int counter) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.counter = counter;
        if(counter > 0){
            state = noQuarterState;
        }
    }

    //投币
    public void insertQuarter() {
        state.insertQuarter();
    }

    //退币
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //转动曲柄
    public void tumCrank() {
         state.tumCrank();
         state.dispense();
    }

    public int getCounter() {
        return counter;
    }

    void setState(State state){
        this.state = state;
    }

    //减少糖果数量
    void releaseBall(){
        System.out.println("糖果的数量即将减少");
        if(counter != 0){
            counter -= 1;
        }
    }

}
