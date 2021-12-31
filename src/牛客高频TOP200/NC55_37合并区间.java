package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC55_37合并区间 {
    public static void main(String[] args) {

    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<>();
        if(intervals == null || intervals.size() == 0) {
            return res;
        }
        //按照每个区间的左端点的大小从小到大排序
        Collections.sort(intervals,(a,b) -> (a.start - b.start));
        //计算区间的个数
        int length = intervals.size();
        int i = 0;
        for(i = 0;i < length;i++) {
            //获得一个区间的起点
            int left = intervals.get(i).start;
            //获得一个区间的终点
            int right = intervals.get(i).end;
            //当c小于等于b的时候合并区间
            while(i < length - 1 && intervals.get(i + 1).start <= intervals.get(i).end) {
                //合并右区间,判断b和d哪个更大
                right = Math.max(right,intervals.get(i + 1).end);
                i++;
            }
            res.add(new Interval(left,right));
        }
        return res;
    }
}
