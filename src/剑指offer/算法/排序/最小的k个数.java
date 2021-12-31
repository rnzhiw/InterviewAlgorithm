package 剑指offer.算法.排序;

import java.util.ArrayList;
import java.util.Arrays;

public class 最小的k个数 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>(k);
        //根据题意要求，如果K>数组的长度，返回一个空的数组
        if (k > input.length) {
            return res;
        }
        //先排序，然后选择前k个即可
        Arrays.sort(input);
        for (int i = 0; i < k; ++i) {
            res.add(input[i]);
        }
        return res;
    }
}
