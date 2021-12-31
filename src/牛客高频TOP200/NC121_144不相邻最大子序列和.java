package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC121_144不相邻最大子序列和 {
    public static void main(String[] args) {

    }

    public long subsequence (int n, int[] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        if(n == 1) {
            return array[0] >= 0 ? array[0] : 0;
        }
        if(n == 2) {
            return Math.max(array[0],array[1]) > 0 ? Math.max(array[0],array[1]) : 0;
        }
        long[] dp = new long[n];
        dp[0] = (array[0] >= 0 ? array[0] : 0);
        dp[1] = Math.max(array[0],array[1]) > 0 ? Math.max(array[0],array[1]) : 0;
        for(int i = 2;i < n;i++) {
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + array[i]);
        }
        return dp[n - 1];
    }
}
