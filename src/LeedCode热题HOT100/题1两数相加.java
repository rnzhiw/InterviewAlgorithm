package LeedCode热题HOT100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class 题1两数相加 {
    public static void main(String[] args) {

    }

    //暴力法
    public int[] twoSum1(int[] nums, int target) {

        int[] res = new int[2];

        for(int i = 0;i < nums.length - 1;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }

    //用map
    public int[] twoSum2(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],i);
        }

        for(int i = 0;i < nums.length;i++) {
            int n1 = target - nums[i];
            if(map.containsKey(n1)) {
                if(map.get(n1) != i) {
                    return new int[] {i,map.get(n1)};
                }
            }
        }

        return res;
    }
}
