package 剑指offer.其他算法;

public class 左旋转字符串 {
    public static void main(String[] args) {

    }

    public String LeftRotateString(String str,int n) {

        if(n > str.length()) {
            return "";
        }

        StringBuffer sb = new StringBuffer();

        char[] chars = str.toCharArray();

        for(int i = n;i < chars.length;i++) {
            sb.append(chars[i]);
        }

        for(int i = 0;i < n;i++) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()) + s.substring(0,n);
    }
}
