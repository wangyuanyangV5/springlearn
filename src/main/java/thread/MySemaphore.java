package thread;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * Created by dell on 2019/2/22.
 */
public class MySemaphore {

    public static void main(String[] args) throws InterruptedException {
        BoundedHashSet<String> boundedHashSet = new BoundedHashSet<>(1);

        boundedHashSet.add("123");

        System.out.println(new Date());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    boundedHashSet.remove("123");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        boundedHashSet.add("qwe");

        System.out.println(new Date());


    }

   static class BoundedHashSet<T>{
        private final Set<T> set;
        private final Semaphore semaphore;

        public BoundedHashSet(int bound){
            this.set = Collections.synchronizedSet(new HashSet<>());
            semaphore = new Semaphore(bound);
        }

        public boolean add(T o) throws InterruptedException {
            semaphore.acquire();
            boolean wasAdd = false;
            try {
                wasAdd = set.add(o);
            }finally {
                if(!wasAdd)
                    semaphore.release();
            }
            return wasAdd;
        }

        public boolean remove(Object o){
            boolean wasRemove = set.remove(o);
            if(wasRemove)
                semaphore.release();
            return wasRemove;
        }

    }

}
