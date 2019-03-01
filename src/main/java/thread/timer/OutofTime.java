package thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by dell on 2019/2/27.
 */
public class OutofTime {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();

//        timer.scheduleAtFixedRate(new FixedRateTask(),1,1000);
        timer.schedule(new ThrowTask(),1);
        SECONDS.sleep(1);
        timer.schedule(new ThrowTask(),1);
        SECONDS.sleep(5);
    }

    static class ThrowTask extends TimerTask{

        @Override
        public void run() {
            throw new RuntimeException();
        }
    }

    static class FixedRateTask extends TimerTask{

        @Override
        public void run() {
            System.out.println(new Date());
        }
    }

}
