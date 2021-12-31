package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC118_129阶乘末尾0的数量 {
    public static void main(String[] args) {

    }

    public long thenumberof0 (long n) {
        long res = 0;
        long d = 5;
        while(n >= d) {
            res = res + n / d;
            d = d * 5;
        }
        return res;
    }
}
