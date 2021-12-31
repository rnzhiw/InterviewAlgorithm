package 牛客高频TOP200;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC27_38螺旋矩阵 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(matrix == null || matrix.length == 0) {
            return arrayList;
        }

        //定义好起始位置
        int top = 0,left = 0,bottom = matrix.length - 1,right = matrix[0].length - 1;
        while(top < (matrix.length + 1) / 2 && left < (matrix.length + 1) / 2) {
            for(int i = left;i <= right;i++) {
                arrayList.add(matrix[top][i]);
            }
            for(int i = top;i <= bottom;i++) {
                arrayList.add(matrix[i][right]);
            }
            for(int i = right;i >= left;i--) {
                arrayList.add(matrix[bottom][i]);
            }
            for(int i = bottom;i >= top;i--) {
                arrayList.add(matrix[i][left]);
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return arrayList;
    }
}
