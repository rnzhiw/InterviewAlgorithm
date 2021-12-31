package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC116_143矩阵乘法 {
    public static void main(String[] args) {

    }

    public int[][] solve (int[][] a, int[][] b) {
        if(a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }
        int m = a.length,p = a[0].length,n = b[0].length;
        int[][] res = new int[m][n];
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                int t = 0;
                for(int k = 0;k < p;k++) {
                    t = t + a[i][k] * b[k][j];
                }
                res[i][j] = t;
            }
        }
        return res;
    }
}
