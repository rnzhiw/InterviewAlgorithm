package 牛客高频TOP200;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC28_17最长回文子串 {
    public static void main(String[] args) {

    }

    public int getLongestPalindrome(String A, int n) {
        int maxLen = 0;
        //暴力解法
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                String now = A.substring(i,j);//确定字符
                if(isPalindrome(now) && now.length() > maxLen){
                    maxLen = now.length();//最大长度
                }
            }
        }
        return maxLen;
    }

    //判断子串是不是回文子串
    public boolean isPalindrome(String s){
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1)) { //不相等
                return false;
            }
        }
        return true;
    }

}
