package 剑指offer.树;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 二叉树的深度 {
    public static void main(String[] args) {

    }

    // 递归法
    public int TreeDepth1(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int left = TreeDepth1(root.left);
        int right = TreeDepth1(root.right);

        return Math.max(left,right) + 1;

    }

    // BFS
    public int TreeDepth2(TreeNode root) {

        if(root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        // 用于计数
        int count = 0;

        while(!deque.isEmpty()) {

            // 每一层的节点数量
            int size = deque.size();
            while(size-- > 0) {
                TreeNode pop = deque.pop();
                if(pop.left != null) {
                    deque.addLast(pop.left);
                }
                if(pop.right != null) {
                    deque.addLast(pop.right);
                }
            }
            count++;
        }

        return count;

    }

    // 用栈
    public int TreeDepth3(TreeNode root) {

        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> level = new Stack<>();

        stack.push(root);
        level.push(1);
        int max = 0;

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            int temp = level.pop();
            max = Math.max(max,temp);
            if(node.left != null) {
                stack.push(node.left);
                level.push(temp + 1);
            }
            if(node.right != null) {
                stack.push(node.right);
                level.push(temp + 1);
            }
        }

        return max;

    }


}
