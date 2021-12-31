package 剑指offer.队列和栈;

import java.util.Stack;

public class 栈的压入弹出序列 {
    public static void main(String[] args) {

    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> stack = new Stack<>();

        int b = 0;
        for(int i = 0;i < pushA.length;i++) {
            stack.push(pushA[i]);
            while(b != popA.length && !stack.empty() && popA[b] == stack.peek()) {
                b++;
                stack.pop();
            }
        }

        return stack.empty();
    }

}
