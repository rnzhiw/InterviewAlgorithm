package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC141_151最大公约数 {
    public static void main(String[] args) {

    }

    public int gcd (int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b,a % b);
    }
}
