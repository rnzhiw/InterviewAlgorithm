package 剑指offer.算法.排序;

import java.util.*;

public class 数组中重复的数字 {
    public static void main(String[] args) {

    }

    // 使用map
    public int duplicate1 (int[] numbers) {

        Map map = new HashMap();

        for(int i = 0;i < numbers.length;i++) {
            if(map.get(numbers[i]) != null) {
                return numbers[i];
            } else {
                map.put(numbers[i],numbers[i]);
            }
        }

        return -1;
    }

    // 排序
    public int duplicate2 (int[] numbers) {

        Arrays.sort(numbers);

        for(int i = 1;i < numbers.length;i++) {
            if(numbers[i] == numbers[i - 1]) {
                return numbers[i];
            }
        }

        return -1;
    }

    // 使用set
    public int duplicate3 (int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < numbers.length;i++) {
            if(set.contains(numbers[i])) {
                return numbers[i];
            } else {
                set.add(numbers[i]);
            }
        }

        return -1;
    }

}
