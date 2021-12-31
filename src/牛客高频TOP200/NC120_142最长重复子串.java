package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC120_142最长重复子串 {
    public static void main(String[] args) {

    }

    public int solve (String a) {
        if(a == null || a.length() == 0) {
            return 0;
        }
        int length = a.length();
        int res = 0;
        for(int i = length / 2;i > 0;i--) {
            for(int j = 0;j < length - i;j++) {
                if(a.charAt(j) == a.charAt(i + j)) {
                    res++;
                } else {
                    res = 0;
                }
                if(res == i) {
                    return i * 2;
                }
            }
        }
        return 0;
    }
}
