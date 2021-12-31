package 剑指offer.算法.模拟;

import java.util.HashSet;
import java.util.Set;

public class 扑克牌顺子 {
    public static void main(String[] args) {

    }

    public boolean IsContinuous(int [] numbers) {

        if(numbers == null || numbers.length == 0) {
            return false;
        }

        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < numbers.length;i++) {
            if(numbers[i] == 0) {
                continue;
            }
            if(set.contains(numbers[i])) {
                return false;
            } else {
                set.add(numbers[i]);
            }
            max = StrictMath.max(max,numbers[i]);
            min = StrictMath.min(min,numbers[i]);
        }

        return max - min < 5;
    }

    public boolean isStraight(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int max = 0,min = 14;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == 0) {
                continue;
            }
            if(set.contains(nums[i])) {
                return false;
            } else {
                set.add(nums[i]);
            }
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return max - min < 5;
    }
}
