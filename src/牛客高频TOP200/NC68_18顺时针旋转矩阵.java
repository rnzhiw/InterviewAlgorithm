package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC68_18顺时针旋转矩阵 {
    public static void main(String[] args) {

    }

    //用暴力法
    public int[][] rotateMatrix1(int[][] mat, int n) {
        int[][] res = new int[n][n];
        if(mat == null || mat.length == 0) {
            return res;
        }
        for(int j = 0;j < n;j++) {
            for(int i = n - 1;i >= 0;i--) {
                res[j][n - i - 1] = mat[i][j];
            }
        }
        return res;
    }

    //先按照对角线翻转，再左右翻转
    public int[][] rotateMatrix2(int[][] mat, int n) {
        if(mat == null || mat.length == 0) {
            return mat;
        }
        //先按照对角线翻转
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < i;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //再左右翻转
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n / 2;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
        return mat;
    }
}
