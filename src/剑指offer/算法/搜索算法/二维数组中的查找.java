package 剑指offer.算法.搜索算法;

public class 二维数组中的查找 {
    public static void main(String[] args) {

    }

    public boolean Find(int target, int [][] array) {

        if(array == null || array.length == 0) {
            return false;
        }

        int i = 0;
        int j = array[0].length - 1;
        int val = 0;

        while(j >= 0 && i < array.length) {
            val = array[i][j];
            if(val == target) {
                return true;
            } else if(val > target) {
                j--;
            } else if(val < target) {
                i++;
            }
        }

        return false;
    }
}
