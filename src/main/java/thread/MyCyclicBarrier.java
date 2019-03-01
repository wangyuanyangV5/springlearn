package thread;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dell on 2019/2/22.
 */
public class MyCyclicBarrier {

    private final CyclicBarrier barrier;
    private final Worker[] workers;

    public MyCyclicBarrier(int counter){
        this.barrier = new CyclicBarrier(counter,() ->{
            System.out.println(Thread.currentThread()+"" + new Date());
        });
        this.workers = new Worker[counter];
        for (int i = 0; i < counter;++i)
            workers[i] = new Worker();
    }

    private class Worker implements Runnable{

        @Override
        public void run() {
            try {

                Thread.sleep(10000);

                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        for(int i = 0; i < workers.length;++i)
            new Thread(workers[i]).start();
    }

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        MyCyclicBarrier barriers = new MyCyclicBarrier(4);
        System.out.println(Thread.currentThread()+"" + new Date());
        barriers.start();

//        ThreadPoolExecutor threadPoolExecutor = Executors.newSingleThreadExecutor();
    }
}
