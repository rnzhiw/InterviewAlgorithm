package 剑指offer.其他算法;

import java.util.Arrays;

public class 把数组排成最小的数 {
    public static void main(String[] args) {

    }

    public String PrintMinNumber(int [] numbers) {

        if(numbers == null || numbers.length == 0) {
            return "";
        }

        String[] nums = new String[numbers.length];

        for(int i = 0;i < numbers.length;i++) {
            nums[i] = numbers[i] + "";
        }

        Arrays.sort(nums,(s1,s2)->{
            return (s1 + s2).compareTo(s2 + s1);
        });

        StringBuffer sb = new StringBuffer();

        for(String num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }
}
