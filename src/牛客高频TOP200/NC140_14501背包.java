package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC140_14501背包 {
    public static void main(String[] args) {

    }

    public int knapsack (int V, int n, int[][] vw) {
        if(V == 0 || n == 0 || vw == null) {
            return 0;
        }
        int[][] dp = new int[n + 1][V + 1];
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= V;j++) {
                if(j < vw[i - 1][0]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - vw[i - 1][0]] + vw[i - 1][1]);
                }
            }
        }
        return dp[n][V];
    }
}
