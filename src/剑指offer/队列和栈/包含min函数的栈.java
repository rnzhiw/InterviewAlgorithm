package 剑指offer.队列和栈;

import java.util.Stack;

public class 包含min函数的栈 {
    public static void main(String[] args) {

    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(minStack.empty()) {
            minStack.push(node);
        } else {
            if(node <= minStack.peek()) {
                minStack.push(node);
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        if(stack.empty() || minStack.empty()) {
            return;
        } else {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if(stack.empty()) {
            return 0;
        }  else {
            return stack.peek();
        }
    }

    public int min() {
        if(minStack.empty()) {
            return 0;
        } else {
            return minStack.peek();
        }
    }

}
