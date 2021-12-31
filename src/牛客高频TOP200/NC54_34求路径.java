package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC54_34求路径 {
    public static void main(String[] args) {

    }

    //用动态规划
    public int uniquePaths1 (int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++) {
            dp[i][0] = 1;
        }
        for(int j = 0;j < n;j++) {
            dp[0][j] = 1;
        }
        for(int i = 1;i < m;i++) {
            for(int j = 1;j < n;j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    //用组合数学
    public int uniquePaths2 (int m, int n) {
        long res = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            //组合公式的循环求解
            res = res * x / y;
        }
        return (int)res;
    }
}
