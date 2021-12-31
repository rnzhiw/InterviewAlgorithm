package 剑指offer.算法.位运算;

import java.util.HashMap;
import java.util.Map;

public class 数组中只出现一次的两个数字 {
    public static void main(String[] args) {

    }

    public int[] FindNumsAppearOnce (int[] array) {

        int[] res = new int[2];

        if(array == null) {
            return res;
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < array.length;i++) {
            int count = map.getOrDefault(array[i],0) + 1;
            map.put(array[i],count);
        }

        int index = 0;
        for(int k : map.keySet()) {
            if(map.get(k) == 1) {
                res[index++] = k;
            }
        }

        return res;
    }
}
