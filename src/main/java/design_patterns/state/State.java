package design_patterns.state;

/**
 * Created by dell on 2019/1/15.
 */
public interface State {
    //投币代码
    void insertQuarter();
    //退钱
    void ejectQuarter();
   // 转动曲柄
    void tumCrank();
    //发送糖果
    void dispense();

}
