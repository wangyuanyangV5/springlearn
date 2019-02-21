package leetcode;

/**
 * Created by dell on 2019/2/20.
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class My7 {



    public static void main(String[] args) {
          System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        if(x == 0)
            return 0;
        int result = 0;
        while (x != 0){
            int tmp = result * 10 + x % 10;
            if(tmp / 10 != result){
                return 0;
            }
            result = tmp;
            x /=10;
        }
        return result;
    }

}
