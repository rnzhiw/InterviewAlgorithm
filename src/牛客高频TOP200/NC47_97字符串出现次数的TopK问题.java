package 牛客高频TOP200;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
class DescComparator implements Comparator<Map.Entry<String,Integer>>
{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())){
            //字典序小的在前 所以 o1 比 o2
            return o2.getKey().compareTo(o1.getKey());
        }else {
            //数量大的在前所以 o1 - o2
            return o1.getValue() - o2.getValue();
        }
    }
}

public class NC47_97字符串出现次数的TopK问题 {
    public static void main(String[] args) {

    }

    //用map
    public String[][] topKstrings1 (String[] strings, int k) {

        if(strings == null || strings.length == 0 || k <= 0) {
            return null;
        }
        //返回数组
        String[][] res = new String[k][2];
        //使用map统计每个字符出现的次数
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < strings.length;i++) {
            String cur = strings[i];
            if(!map.containsKey(cur)) {
                map.put(cur,1);
            } else {
                map.put(cur,map.get(cur) + 1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        //对字符串降序排序
        Collections.sort(list,
                (o1, o2) ->
                        (o1.getValue().compareTo(o2.getValue()) ==
                                0 ? o1.getKey().compareTo(o2.getKey()) :
                                o2.getValue().compareTo(o1.getValue()))
        );
        for(int i = 0;i < k;i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }
        return res;
    }

    //用优先级队列
    public String[][] topKstrings2 (String[] strings, int k) {
        if (k == 0){
            return new String[][]{};
        }
        Comparator compa = new DescComparator();
        String[][] res = new String[k][2];
        TreeMap<String,Integer> map = new TreeMap<>();
        // 统计各个字符串出现的次数
        for (int i=0;i<strings.length;++i){
            String s = strings[i];
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        PriorityQueue queue = new PriorityQueue(k,compa);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            // 堆的元素个数小于k，则直接加入堆中
            if (queue.size() < k) {
                queue.offer(entry);
            } else if (compa.compare(queue.peek(),entry) < 0) {
                //如果堆顶元素 < 新数，则删除堆顶，加入新数入堆
                queue.poll();
                queue.offer(entry);
            }
        }

        // 返回topK
        for (int i = k-1; i >=0;i--) {
            Map.Entry<String,Integer> entry =(Map.Entry)queue.poll();
            res[i][0] = entry.getKey();
            res[i][1] = String.valueOf(entry.getValue());
        }
        return res;
    }
}
