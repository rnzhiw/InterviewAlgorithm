package 剑指offer.其他算法;

import java.util.*;

public class 字符流中第一个不重复的字符 {
    public static void main(String[] args) {

    }

    private Deque<Character> deque = new ArrayDeque<>();
    private int[] count = new int[128];

    public void Insert(char ch) {
        if (count[ch] == 0) {
            deque.offer(ch);
        }
        count[ch]++;
    }

    public char FirstAppearingOnce() {
        while (!deque.isEmpty() && count[deque.peek()] > 1) {
            deque.poll();
        }
        return deque.peek() == null ? '#' : deque.peek();
    }
}
