package 剑指offer.其他算法;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class 剑指Offer10斐波那契数列 {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for(int i = 2;i <= n;i++) {
            res[i] = (res[i - 1] + res[i - 2]) % 1000000007;
        }
        return res[n];
    }
}
