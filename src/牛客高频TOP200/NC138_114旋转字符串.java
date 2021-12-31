package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC138_114旋转字符串 {
    public static void main(String[] args) {

    }

    public boolean solve (String A, String B) {
        if(A == null || B == null || A.length() < 2 || B.length() < 2 || A.length() != B.length()) {
            return false;
        }
        return (A + A).contains(B);
    }
}
