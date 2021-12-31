package 牛客高频TOP200;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC14_41最长无重复子数组 {
    public static void main(String[] args) {

    }

    public int maxLength (int[] arr) {

        if(arr.length < 2) {
            return arr.length;
        }

        Map<Integer,Integer> windows = new HashMap<>();

        int res = 0;

        int left = -1;

        for(int right = 0;right < arr.length;right++) {
            if(windows.containsKey(arr[right])) {
                left = Math.max(left,windows.get(arr[right]));
            }
            //更新窗口的大小
            res = Math.max(res,right - left);
            windows.put(arr[right],right);
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int left = -1;
        int res = 0;
        for(int i = 0;i < s.length();i++) {
            char temp = s.charAt(i);
            if(map.containsKey(temp)) {
                left = Math.max(left,map.get(temp));
            }
            res = Math.max(res,i - left);
            map.put(temp,i);
        }
        return res;
    }
}
