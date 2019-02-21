package thread.unsafe;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dell on 2019/2/20.
 */
public class Iquestion {

    public static void main(String[] args) {

        Add add = new Add();
        Set<Integer> set = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(2);
//        for(int i = 0; i < 100;i++){
//            executorService.submit(()->{
//                int j = add.getNext();
//                set.add(j);
//                System.out.println(j);
//            });
//        }
        executorService.submit(()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Add.class){
                System.out.println(Thread.currentThread() + "进入暂停8秒的同步快");
                System.out.println(Thread.currentThread() + "" +new Date());
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "" +new Date());
            synchronized (Add.class){
                System.out.println(Thread.currentThread() + "进入暂停6秒的同步快");
                System.out.println(Thread.currentThread() + "" +new Date());
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() + "" +new Date());
        });
        executorService.submit(()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Add.class){
                System.out.println(Thread.currentThread() + "进入暂停1秒的同步快");
                System.out.println(Thread.currentThread() + "" +new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "" +new Date());
            synchronized (Add.class){
                try {
                    System.out.println(Thread.currentThread() + "进入暂停6秒的同步快");
                    System.out.println(Thread.currentThread() + "" +new Date());
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() + "" +new Date());
        });
        executorService.submit(() ->{
            countDownLatch.countDown();
            countDownLatch.countDown();
        });
        executorService.shutdown();
    }

    private static class Add{
        private int i = 1;

        private int getNext(){
            return i++;
        }
    }

    public enum  MyEnum{
        ASD("asd",1),
        ZXC("rty",1);
        String dec;
        int id;
        MyEnum(String dec,int id){
           this.dec = dec;
           this.id = id;
        }
    }
}
