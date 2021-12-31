package 剑指offer.树;

import java.util.Deque;
import java.util.LinkedList;

public class 对称的二叉树 {
    public static void main(String[] args) {

    }

    // BFS
    boolean isSymmetrical1(TreeNode pRoot) {

        if(pRoot == null || (pRoot.left == null && pRoot.right == null)) {
            return true;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        deque.push(pRoot.left);
        deque.push(pRoot.right);

        TreeNode left = null;
        TreeNode right = null;

        while(!deque.isEmpty()) {
            left = deque.pop();
            right = deque.pop();

            if(left == null && right == null) {
                continue;
            } else if(left == null || right == null) {
                return false;
            }

            // 如果左右结点的值不同的话，那么返回false
            if(left.val != right.val) {
                return false;
            }

            deque.addLast(left.left);
            deque.addLast(right.right);
            deque.addLast(left.right);
            deque.addLast(right.left);

        }

        return true;
    }

    boolean isSymmetrical2(TreeNode pRoot) {

        return pRoot == null || check(pRoot.left,pRoot.right);
    }

    public boolean check(TreeNode node1,TreeNode node2) {

        if(node1 == null && node2 == null) {
            return true;
        } else if(node1 == null || node2 == null) {
            return false;
        }

        if(node1.val != node2.val) {
            return false;
        } else {
            return check(node1.left,node2.right) && check(node1.right,node2.left);
        }
    }


}
