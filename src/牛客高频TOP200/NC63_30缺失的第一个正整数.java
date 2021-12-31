package 牛客高频TOP200;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC63_30缺失的第一个正整数 {
    public static void main(String[] args) {

    }

    public int minNumberDisappeared (int[] nums) {
        if(nums == null || nums.length == 0) {
            return 1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],1);
        }
        for(int i = 1;i <= nums.length;i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
