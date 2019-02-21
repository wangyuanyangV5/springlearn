package leetcode;

/**
 * Created by dell on 2019/2/20.
 */
public class my11 {
    public static void main(String[] args) {

    }

    public static  int maxArea(int[] height) {
        if(height.length < 2)
            return 0;
        int left = 0;
        int right = 1;

        int hight = Math.min(height[left],height[right]);
        int maxhigh = Math.max(height[left],height[right]);
        long result = hight * (right - left);
        for(int i= 3; i < height.length;++ i){
            if(height[i] > hight){

            }
        }
        return 0;
    }
}
/**
 * 1,8 面积 1
 * 1,8,6
 */
