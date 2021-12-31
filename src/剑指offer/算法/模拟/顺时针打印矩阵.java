package 剑指offer.算法.模拟;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(arrayList == null || matrix == null || matrix[0].length == 0) {
            return arrayList;
        }

        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(true) {
            for(int col = left;col <= right;col++) {
                arrayList.add(matrix[up][col]);
            }
            up++;
            if(up > down) {
                break;
            }

            for(int row = up;row <= down;row++) {
                arrayList.add(matrix[row][right]);
            }
            right--;
            if(right < left) {
                break;
            }

            for(int col = right;col >= left;col--) {
                arrayList.add(matrix[down][col]);
            }
            down--;
            if(down < up) {
                break;
            }

            for(int row = down;row >= up;row--) {
                arrayList.add(matrix[row][left]);
            }
            left++;
            if(left > right) {
                break;
            }

        }

        return arrayList;

    }
}
