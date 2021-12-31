package 牛客高频TOP200;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC142_156数组中只出现一次的数 {
    public static void main(String[] args) {

    }

    public int foundOnceNumber (int[] arr, int k) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
