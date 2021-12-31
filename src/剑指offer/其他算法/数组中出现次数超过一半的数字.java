package 剑指offer.其他算法;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {

    }

    // 用map
    public int MoreThanHalfNum_Solution1(int [] array) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < array.length;i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i]) + 1);
            } else {
                map.put(array[i],1);
            }
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > array.length / 2) {
                return key;
            }
        }

        return 0;

    }

    // 排序
    public int MoreThanHalfNum_Solution2(int [] array) {

        Arrays.sort(array);

        return array[array.length / 2];

    }

    public int MoreThanHalfNum_Solution3(int [] array) {

        int candidate = array[0];
        int count = 1;

        for(int i = 1;i < array.length;i++) {
            if(candidate == array[i]) {
                count++;
            } else if(candidate != array[i]) {
                count--;
            }

            if(count == 0) {
                candidate = array[i + 1];
                count++;
            }
        }

        return candidate;

    }
}
