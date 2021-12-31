package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC91_27集合的所有子集1 {
    public static void main(String[] args) {
        int[] S = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> res = subsets(S);
        System.out.println(res.toString());
    }

    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        LinkedList<Integer> track = new LinkedList<>();
        back(S,0,track);
        return res;
    }

    public static void back(int[] S,int start,LinkedList<Integer> track) {
        res.add(new ArrayList<>(track));
        for(int i = start;i < S.length;i++) {
            track.add(S[i]);
            back(S,i + 1,track);
            track.removeLast();
        }
    }


}
