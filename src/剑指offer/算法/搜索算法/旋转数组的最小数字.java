package 剑指offer.算法.搜索算法;

import java.util.HashMap;
import java.util.Map;

public class 旋转数组的最小数字 {
    public static void main(String[] args) {

    }

    Map<String,String> map = new HashMap<>();

    public int minNumberInRotateArray(int [] array) {

        int l = 0,r = array.length - 1;

        while(l < r) {
            int mid = l + (r - l) / 2;
            if(array[mid] > array[r]) {
                l = mid + 1;
            } else if(array[mid] < array[r]) {
                r = mid;
            } else {
                r--;
            }
        }

        return array[l];
    }
}
