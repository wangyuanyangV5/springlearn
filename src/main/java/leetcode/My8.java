package leetcode;

/**
 * Created by dell on 2019/2/20.
 */
public class My8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("18446744073709551617"));
    }

    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();


        int i = 0;
        while (i < chars.length && chars[i] == ' '){
            i ++;
        }
        int add = i;
        if(i < chars.length && (chars[i] == '-' || chars[i] == '+'))
            i++;
        long result = 0L;
        for(;i < chars.length;++i){
            if('0' <= chars[i] && chars[i] <= '9'){
                if((result * 10 + Integer.parseInt(chars[i] + ""))/ 10 != result){
                    if(chars[add] == '-'){
                        if(result < 0 || result * -1 < Integer.MIN_VALUE)
                            return Integer.MIN_VALUE;
                    }else {
                        if(result < 0 || result > Integer.MAX_VALUE)
                            return Integer.MAX_VALUE;
                    }
                }
                result = result * 10 + Integer.parseInt(chars[i] + "");
            }else {
                break;
            }
        }

        if(add >= chars.length )
            return 0;

        if(chars[add] == '-'){
            if(result < 0 || result * -1 < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            result *= -1;
        }else {
            if(result < 0 || result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }
        return (int)result;
    }

}
