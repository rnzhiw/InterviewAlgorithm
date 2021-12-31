package 牛客高频TOP200;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC77_49最长的括号子串 {
    public static void main(String[] args) {

    }

    public int longestValidParentheses (String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        int last = -1;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if(stack.empty()) {
                    last = i;
                } else {
                    stack.pop();
                    if(stack.empty()) {
                        maxLen = Math.max(maxLen,i - last);
                    } else {
                        maxLen = Math.max(maxLen,i - stack.peek());
                    }
                }
            }
        }
        return maxLen;
    }
}
