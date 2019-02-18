package leetcode;

/**
 * Created by dell on 2019/2/18.
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 示例 1：
 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。

 示例 2：
 输入: "cbbd"
 输出: "bb"
 */
public class my5 {


    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String myLongestPalindrome(String s) {

        int sLength = s.length();

        if(sLength == 1 || sLength == 0){
            return s;
        }

        if(sLength == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
        }
        String result = "";
        for(int i = 1; i < sLength;++ i){
            int right = sLength - i - 1;
            if(right > 0 && ((s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1))
                    || (s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)))){
                for(int j = 1;j <= Math.min(right,i);++j){
                    if(s.charAt(i - j) == s.charAt(i + j)){
                        int length = j * 2 + 1;
                        if(length > result.length()){
                            int tmpLeft = i - j;
                            int tmpRight = i + j + 1;
                            result = s.substring(Math.max(0,i - j),Math.min(i + j + 1,sLength));
                        }

                    }else {
                        break;
                    }
                }
            }
            if(s.charAt(i - 1) == s.charAt(i)){
                int left = i - 1;
                int r = i;
                while (left >= 0 && r < sLength){
                    if(s.charAt(left) == s.charAt(r)){
                        if(r - left + 1 > result.length()){
                            result = s.substring(left,r + 1);
                        }
                        --left;
                        ++r;
                    }else {
                        break;
                    }
                }
            }
            if(right > 0 && s.charAt(i) == s.charAt(i + 1)){
                int left = i;
                int r = i + 1;
                while (left >= 0 && r < sLength){
                    if(s.charAt(left) == s.charAt(r)){
                        if(r - left + 1 > result.length()){
                            result = s.substring(left,r + 1);
                        }
                        --left;
                        ++r;
                    }else {
                        break;
                    }
                }
            }
        }

        return result;
    }



    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
