package 牛客高频TOP200;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC131_125和为K的连续子数组 {
    public static void main(String[] args) {

    }

    public int maxlenEqualK (int[] arr, int k) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,-1);
        int res = 0;
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            sum = sum + arr[i];
            if(map.containsKey(sum - k)) {
                res = Math.max(res,i - map.get(sum - k));
            }
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }
        return res;
    }




}
