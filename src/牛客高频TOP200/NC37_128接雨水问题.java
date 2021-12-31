package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC37_128接雨水问题 {
    public static void main(String[] args) {

    }

    public long maxWater (int[] arr) {
        if(arr.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE,maxIndex = -1;
        //计算总的水量
        long water = 0;
        //找到最高的柱子
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        //计算最高的柱子的左边
        int left = arr[0],right = 0;
        for(int i = 1;i < maxIndex;i++) {
            right = arr[i];
            if(right > left) {
                left = arr[i];
            } else {
                water = water + (left - right);
            }
        }
        //计算最高的柱子的右边
        left = 0;
        right = arr[arr.length - 1];
        for(int i = arr.length - 2;i > maxIndex;i--) {
            left = arr[i];
            if(left > right) {
                right = arr[i];
            } else {
                water = water + (right - left);
            }
        }
        return water;
    }
}
