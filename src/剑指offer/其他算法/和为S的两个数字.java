package 剑指offer.其他算法;

import java.util.ArrayList;

public class 和为S的两个数字 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int i = 0,j = array.length - 1;

        while(i < j) {
            int s = array[i] + array[j];
            if(s < sum) {
                i++;
            } else if(s > sum) {
                j--;
            } else {
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                return arrayList;
            }
        }

        return arrayList;
    }
}
