package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC115_138矩阵最长递增路径 {
    public static void main(String[] args) {

    }

    int max = 0;
    public int solve (int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                dfs(matrix,i,j,-1,0);
            }
        }
        return max;
    }

    //pre指上一个格子的数字，len是上一个格子的最大数字
    public void dfs(int[][] matrix,int i,int j,int pre,int len) {
        if(i < 0 || i >= matrix.length || j < 0 || j < matrix[0].length || matrix[i][j] <= pre) {
            max = Math.max(max,len);
            return;
        }
        //向四个方向扩展
        dfs(matrix,i - 1,j,matrix[i][j],len + 1);
        dfs(matrix,i + 1,j,matrix[i][j],len + 1);
        dfs(matrix,i,j - 1,matrix[i][j],len + 1);
        dfs(matrix,i,j + 1,matrix[i][j],len + 1);
    }

}
