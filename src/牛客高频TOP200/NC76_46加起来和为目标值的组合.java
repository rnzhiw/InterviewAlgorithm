package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC76_46加起来和为目标值的组合 {
    public static void main(String[] args) {

    }

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        //首先进行排序，这样能够保证输出按照非递减顺序排列 -> 【10，10，60】...
        Arrays.sort(num);
        helper(num, 0, target, new ArrayList<Integer>());
        return ans;
    }

    //搜索可行解
    public void helper(int[] num, int index, int target, ArrayList<Integer> tmp){
        //这里采用了target - num[index]的形式求解
        //每一轮搜索，target值都会减小，如果小于0，返回
        if(target < 0) {
            return;
        }
        //如果等于0，说明找到了一组可行解，将其添加到解集ans中
        if(target == 0) {
            ans.add(new ArrayList<Integer>(tmp));
        }

        //从这里开始一次尝试
        for(int i = index; i < num.length; i++){
            //如果叠加的数值之和 + 当前值 > target，
            //由于这组数据是排序完成的，所以不必尝试后续的数值
            //比如：【10，10，20，50】，叠加数值之和已经超过target【80】，
            //后续的【10，10，20，60】、【10，10，20，70】不必再尝试，即便出现重复也是如此
            if(target - num[i] < 0) {
                break;
            }
            //希望跳过重复的解集，比如出现重复的数值【10，10，60，60，60，70】，target还是80
            // 那么，【10，10，60】只需要一组就可以了
            if(i > index && num[i] == num[i - 1]) {
                continue;
            }
            //上述是排除一些明显可以不必尝试的情况，除去这部分内容，可以继续尝试搜索后续的可行解
            //首先添加该数值到临时解集tmp中
            tmp.add(num[i]);
            //然后尝试向后搜索
            helper(num, i + 1,target - num[i],tmp);
            //回溯时，需要删除tmp中的最后数值【这儿可能添加了一个数值，使得整体的叠加值 > target等】
            tmp.remove(tmp.size() - 1);
        }
    }
}
