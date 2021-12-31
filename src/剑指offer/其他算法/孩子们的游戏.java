package 剑指offer.其他算法;

import java.util.Deque;
import java.util.LinkedList;

public class 孩子们的游戏 {
    public static void main(String[] args) {

    }

    public int LastRemaining_Solution1(int n, int m) {

        Deque<Integer> deque = new LinkedList<>();

        if(n <= 1 || m < 0) {
            return -1;
        }

        for(int i = 0;i < n;i++) {
            deque.addLast(i);
        }

        while(deque.size() != 1) {
            for(int i = 0;i < m - 1;i++) {
                deque.addLast(deque.remove());
            }
            deque.remove();
        }

        return deque.remove();
    }

    public int LastRemaining_Solution2(int n, int m) {

        if(n == 0 && m == 0) {
            return -1;
        }

        int id = 0;
        for(int i = 2;i <= n;i++) {
            id = (id + m) % i;
        }

        return id;
    }
}
