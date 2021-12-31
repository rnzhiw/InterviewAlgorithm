package 剑指offer.算法.排序;

import java.util.ArrayList;
import java.util.Collections;

public class 数据流中的中位数 {
    public static void main(String[] args) {

    }

    ArrayList<Integer> arrayList = new ArrayList<>();

    public void Insert(Integer num) {

        arrayList.add(num);

    }

    public Double GetMedian() {

        Collections.sort(arrayList);

        int index = arrayList.size() / 2;

        if(arrayList.size() % 2 != 0) {
            return (double)arrayList.get(index);
        } else {
            return ((double)arrayList.get(index - 1) + (double)arrayList.get(index)) / 2;
        }

    }
}
