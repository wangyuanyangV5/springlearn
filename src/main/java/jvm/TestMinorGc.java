package jvm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dell on 2019/2/13.
 * jvm参数 -verbose:gc -Xms20M -Xmx20M  -Xmn10M  -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 */
public class TestMinorGc {

    private static final int _1MB = 1024 *1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5;
        allocation1 = new byte[2 * 1024 *1024];
        allocation2 = new byte[2 * 1024 *1024];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[ 7 * _1MB];
        int i = test4();
    }

    private static Map<String, String> test3() {

        Map<String, String> map = new HashMap<String, String>();

        map.put("KEY", "INIT");

        try {

            System.out.println("try...");

            map.put("KEY", "TRY");

            return map;

        } catch (Exception e) {

            System.out.println("catch...");

            map.put("KEY", "CATCH");

        } finally {

            System.out.println("finally...");

            map.put("KEY", "FINALLY");

            map = null;

        }

        return map;

    }

    private static int test4() {

        int i = 1;

        try {

            System.out.println("try...");

            i = i / 0;

            return i += 10;

        } catch (Exception e) {

            System.out.println("catch...");

            return i;

        } finally {

            i++;

            System.out.println("finally...");

            System.out.println("i=" + i);

        }

    }
}
