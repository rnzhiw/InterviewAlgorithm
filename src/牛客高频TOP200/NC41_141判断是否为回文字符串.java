package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC41_141判断是否为回文字符串 {
    public static void main(String[] args) {

    }

    public boolean judge (String str) {
        int l = str.length();
        for(int i = 0; i < l/2; i++){
            if(str.charAt(i) != str.charAt(l-i-1)) {
                return false;
            }
        }
        return true;
    }
}
