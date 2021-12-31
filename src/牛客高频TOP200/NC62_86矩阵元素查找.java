package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC62_86矩阵元素查找 {
    public static void main(String[] args) {

    }

    public int[] findElement(int[][] mat, int n, int m, int x) {

        int[] res = new int[2];
        if(n < 0 || m < 0) {
            return res;
        }
        int nn = n - 1,mm = 0;
        while(nn >= 0 && mm <= m - 1) {
            if(mat[nn][mm] == x) {
                return new int[]{nn,mm};
            } else if(mat[nn][mm] > x) {
                nn--;
            } else if(mat[nn][mm] < x) {
                mm++;
            }
        }
        return res;
    }
}
