package 牛客高频TOP200;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC88_111最大数 {
    public static void main(String[] args) {

    }

    public String solve (int[] nums) {
        String[] ss = new String[nums.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < nums.length;i++) {
            ss[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ss,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o2 + o1) - Integer.valueOf(o1 + o2);
            }
        });
        if(ss[0].equals("0")) {
            return "0";
        }
        for(int i = 0;i < ss.length;i++) {
            sb.append(ss[i]);
        }
        return sb.toString();
    }
}
