package 牛客高频TOP200;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC18_52有效括号序列 {
    public static void main(String[] args) {

    }

    //用栈
    public boolean isValid (String s) {
        if(s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length;i++) {
            if(chars[i] == '(') {
                stack.push(')');
            } else if(chars[i] == '{') {
                stack.push('}');
            } else if(chars[i] == '[') {
                stack.push(']');
            } else {
                if(stack.empty()) {
                    return false;
                } else if(stack.pop() != chars[i]) {
                    return false;
                }
            }
        }
        //如果栈为空，返回true
        return stack.empty();
    }
}
