package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/2/13.
 */
public class OOMObject {

    public byte[] placeholder = new byte[64 * 1024];

    public static void main(String[] args) throws InterruptedException {
        fillHeap(100000);
    }

    public static void fillHeap(int num)throws  InterruptedException{
        List<OOMObject> oomObjects = new ArrayList<>();
        for(int i = 0; i < num; i++){
            Thread.sleep(500);
            oomObjects.add(new OOMObject());
        }
        System.gc();
    }

}
