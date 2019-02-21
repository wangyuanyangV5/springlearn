package jvm;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierDemo {

    private final static CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new MyBarrierAction());

    private final static AtomicInteger atcIx = new AtomicInteger(1);

    public static void main(String[] args) {

        for (int ix = 0; ix != 10; ix++){

            new Thread(new Runnable() {

                public void run() {

                    try{

                        System.out.println(Thread.currentThread().getName() + " start");

                        Thread.sleep(atcIx.getAndIncrement() * 1000 );

                        cyclicBarrier.await();

                        System.out.println( Thread.currentThread().getName() + " stop" );

                    } catch ( Exception ex){

                    }

                }

            }, "Thread-" + ix).start();

        }

    }



    private static class MyBarrierAction implements Runnable {

        @Override

        public void run() {

            System.out.println("MyBarrierAction is call.");

        }

    }

}