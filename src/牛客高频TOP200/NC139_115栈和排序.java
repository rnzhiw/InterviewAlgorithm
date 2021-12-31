package 牛客高频TOP200;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC139_115栈和排序 {
    public static void main(String[] args) {

    }

    public int[] solve (int[] a) {
        int[] res = new int[a.length];
        if(a == null || a.length == 0) {
            return res;
        }
        int max = Integer.MIN_VALUE;
        int[] maxs = new int[a.length];
        for(int i = a.length - 1;i >= 0;i--) {
            if(a[i] > max) {
                max = a[i];
            }
            maxs[i] = max;
        }
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        for(int i = 0;i < a.length;i++) {
            stack.push(a[i]);
            while(!stack.empty() && i < a.length - 1 && stack.peek() >maxs[i + 1]) {
                list.add(stack.pop());
            }
        }
        while(!stack.empty()) {
            list.add(stack.pop());
        }
        for(int i = 0;i < list.size();i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
