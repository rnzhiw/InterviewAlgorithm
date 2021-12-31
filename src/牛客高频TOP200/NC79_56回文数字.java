package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC79_56回文数字 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome (int x) {
        String res = String.valueOf(x);
        return isPalindrome(res);
    }

    //判断子串是不是回文子串
    public boolean isPalindrome(String s){
        int length = s.length();
        for(int i = 0;i < length / 2;i++) {
            if(s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
