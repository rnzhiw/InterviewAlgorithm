package 剑指offer.树;

import java.util.Deque;
import java.util.LinkedList;

public class 树的子结构 {
    public static void main(String[] args) {

    }

    // 递归
    public boolean HasSubtree1(TreeNode root1,TreeNode root2) {

        if(root1 == null || root2 == null) {
            return false;
        }

        if(root1.val == root2.val) {
            if(subtree(root1,root2)) {
                return true;
            }
        }

        return HasSubtree1(root1.left,root2) || HasSubtree1(root1.right,root2);
    }

    public boolean subtree(TreeNode root1,TreeNode root2) {

        if(root2 == null) {
            return true;
        }
        if(root1 == null) {
            return false;
        }

        if(root1.val == root2.val) {
            return subtree(root1.left,root2.left) && subtree(root1.right,root2.right);
        }

        return false;

    }

    public boolean HasSubtree2(TreeNode root1,TreeNode root2) {

        if(root1 == null || root2 == null) {
            return false;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root1);

        while(!deque.isEmpty()) {

            TreeNode cur = deque.pop();

            if(subtree(cur,root2)) {
                return true;
            } else {
                if(cur.left != null) {
                    deque.addLast(cur.left);
                }
                if(cur.right != null) {
                    deque.addLast(cur.right);
                }
            }
        }

        return false;
    }

}
