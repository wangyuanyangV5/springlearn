package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2019/2/12.
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 示例 1:
 输入: "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

 示例 2:
 输入: "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

 示例 3:
 输入: "pwwkew"
 输出: 3
 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class my3 {
    public static void main(String[] args) {
       System.out.println(lengthOfLongestSubstring50("cdd"));
    }


    public static int lengthOfLongestSubstring50(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstring45(String s){
        char[] chars = s.toCharArray();
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        int[] length = new int[s.length()];

        for(int i = 0;i < chars.length;i++){
            Integer index = characterIntegerMap.get(chars[i]);
            if(index == null){
                length[i] = i == 0 ? 1 : length[i - 1] + 1;
            }else {
                int last =  index + 1;
                int lastLength = length[i - 1];
                int indexLast = i - lastLength;
                if(last >  indexLast){
                    length[i] = i - last + 1;
                }else {
                    length[i] = i - indexLast + 1;
                }

            }
            characterIntegerMap.put(chars[i],i);
        }

        int max = 0;

        for(int i: length)
            if(i > max)
                max = i;
        return max;
    }

}
