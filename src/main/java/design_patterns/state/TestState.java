package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public class TestState {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();

        System.out.println(gumballMachine);

    }
}
