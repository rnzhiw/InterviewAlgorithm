package 剑指offer.其他算法;

import java.util.Stack;

public class 替换空格 {
    public static void main(String[] args) {

    }

    // 暴力法
    public String replaceSpace1 (String s) {

        return s.replaceAll(" ","%20");
    }

    public String replaceSpace2 (String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
