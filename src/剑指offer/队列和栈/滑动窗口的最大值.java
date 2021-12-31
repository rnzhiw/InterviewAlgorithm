package 剑指offer.队列和栈;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 滑动窗口的最大值 {
    public static void main(String[] args) {

    }

    // 暴力法
    public ArrayList<Integer> maxInWindows1(int [] num, int size) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(num == null || size <= 0 || size > num.length) {
            return arrayList;
        }

        for(int i = 0;i <= num.length - size;i++) {
            int[] a = new int[size];
            for(int j = 0;j < size;j++) {
                a[j] = num[i + j];
            }
            int maxn = maxn(a);
            arrayList.add(maxn);
        }

        return arrayList;
    }

    public int maxn(int[] a) {

        if(a == null) {
            return 0;
        }

        int max = a[0];

        for(int i = 0;i < a.length;i++) {
            if(a[i] >= max) {
                max = a[i];
            }
        }

        return max;
    }

    public ArrayList<Integer> maxInWindows2(int [] num, int size) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(num == null || size <= 0 || size > num.length) {
            return arrayList;
        }

        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0;i < num.length;i++) {
            while(!deque.isEmpty() && num[i] > num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if(deque.getFirst() == i - size) {
                deque.pollFirst();
            }
            if(i >= size - 1) {
                arrayList.add(num[deque.getFirst()]);
            }
        }

        return arrayList;
    }


}
