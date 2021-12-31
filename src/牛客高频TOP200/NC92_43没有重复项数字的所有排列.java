package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC92_43没有重复项数字的所有排列 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> res = permute(num);
        System.out.println(res.toString());
    }

    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        LinkedList<Integer> list = new LinkedList<>();
        back(num,list);
        return res;
    }

    public static void back(int[] num, LinkedList<Integer> list) {
        if(list.size() == num.length) {
            res.add(new ArrayList<>(list));
        }
        for(int i = 0;i < num.length;i++) {
            if(list.contains(num[i])) {
                continue;
            }
            list.add(num[i]);
            back(num,list);
            list.removeLast();
        }
    }
}
















