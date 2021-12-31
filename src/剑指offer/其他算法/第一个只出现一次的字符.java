package 剑指offer.其他算法;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {
    public static void main(String[] args) {

    }

    public char firstUniqChar(String s) {
        if(s == null || s.length() == 0) {
            return ' ';
        }
        Map<Character,Boolean> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length;i++) {
            if(map.containsKey(chars[i])) {
                map.put(chars[i],false);
            } else {
                map.put(chars[i],true);
            }
        }
        for(Map.Entry<Character,Boolean> entry : map.entrySet()) {
            if(entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }





}
