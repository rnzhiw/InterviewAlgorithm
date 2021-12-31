package 牛客高频TOP200;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC85_95数组中的最长连续子序列 {
    public static void main(String[] args) {

    }

    //排序
    public int MLS1 (int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        //先设置最大的值为1
        int max = 1;
        //记录目前的长度
        int count = 1;
        Arrays.sort(arr);
        for(int i = 1;i < arr.length;i++) {
            if(arr[i] == arr[i - 1]) {
                continue;
            }
            if(arr[i] - arr[i - 1] == 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }

}
