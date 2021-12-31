package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC99_108最大正方形 {
    public static void main(String[] args) {
        char[][] matrix = new char[][] {
                {'1','1','1','0','0'},{'1','1','1','0','0'},{'1','1','1','0','0'},{'1','0','1','0','0'}};
        int res = solve(matrix);
        System.out.println(res);
    }

    public static int solve (char[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int max = 0;
        int[][] dp = new int[height + 1][width + 1];
        for(int i = 1;i <= height;i++) {
            for(int j = 1;j <= width;j++) {
                if(matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j],Math.min(dp[i - 1][j - 1],dp[i][j - 1])) + 1;
                    max = Math.max(dp[i][j],max);
                }
            }
        }
        return max * max;
    }
}
