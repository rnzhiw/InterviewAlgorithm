package 剑指offer.树;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 二叉树的镜像 {
    public static void main(String[] args) {

    }

    // BFS
    public TreeNode Mirror1 (TreeNode pRoot) {

        if(pRoot == null) {
            return null;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        deque.push(pRoot);

        while(!deque.isEmpty()) {
            // 每层结点的数量
            int size = deque.size();
            while(size-- > 0) {
                TreeNode pop = deque.pop();
                TreeNode left = pop.left;
                pop.left = pop.right;
                pop.right = left;
                if(pop.left != null) {
                    deque.addLast(pop.left);
                }
                if(pop.right != null) {
                    deque.addLast(pop.right);
                }
            }
        }
        return pRoot;
    }

    // 用栈
    public TreeNode Mirror2 (TreeNode pRoot) {

        if(pRoot == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.push(pRoot);

        while(!stack.empty()) {
            TreeNode pop = stack.pop();
            TreeNode temp = pop.left;
            pop.left = pop.right;
            pop.right = temp;
            if(pop.left != null) {
                stack.push(pop.left);
            }
            if(pop.right != null) {
                stack.push(pop.right);
            }
        }

        return pRoot;
    }

    // 非递归中序遍历交换
    public TreeNode Mirror3 (TreeNode pRoot) {

        if(pRoot == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = pRoot;

        while(node != null || !stack.empty()) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
            if(!stack.empty()) {
                node = stack.pop();
                TreeNode left = node.left;
                node.left = node.right;
                node.right = left;
                node = node.left;
            }
        }

        return pRoot;
    }

    // 递归中序遍历交换
    public TreeNode Mirror4 (TreeNode pRoot) {

        if(pRoot == null) {
            return null;
        }

        Mirror4(pRoot.left);

        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        Mirror4(pRoot.left);

        return pRoot;
    }

    // 递归后序遍历交换
    public TreeNode Mirror5 (TreeNode pRoot) {

        if(pRoot == null) {
            return null;
        }

        Mirror5(pRoot.left);
        Mirror5(pRoot.right);

        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        return pRoot;
    }

}
