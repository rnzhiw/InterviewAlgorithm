package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC45_59矩阵的最小路径和 {
    public static void main(String[] args) {

    }

    public int minPathSum (int[][] matrix) {

        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int n = matrix.length,m = matrix[0].length;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(i == 0 && j != 0) {
                    matrix[i][j] = matrix[i][j - 1] + matrix[i][j];
                }
                if(i != 0 && j == 0) {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j];
                }
                if(i != 0 && j != 0) {
                    matrix[i][j] = Math.min(matrix[i - 1][j],matrix[i][j - 1]) + matrix[i][j];
                }
            }
        }

        return matrix[n - 1][m - 1];
    }
}
