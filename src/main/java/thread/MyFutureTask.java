package thread;


import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by dell on 2019/2/22.
 */
public class MyFutureTask {

    private static FutureTask<String> futureTask = new FutureTask<String>(() -> {
            Thread.sleep(10000);
            return "Callable return";
    });


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(new Date());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
        System.out.println(new Date());
    }


}
