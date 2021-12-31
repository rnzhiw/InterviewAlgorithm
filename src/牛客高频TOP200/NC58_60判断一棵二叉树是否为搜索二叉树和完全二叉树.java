package 牛客高频TOP200;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC58_60判断一棵二叉树是否为搜索二叉树和完全二叉树 {
    public static void main(String[] args) {

    }

    public boolean[] judgeIt (TreeNode root) {
        return new boolean[]{isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE),isComplete(root)};
    }

    public boolean isBST(TreeNode root,int left,int right) {
        if(root == null) {
            return true;
        }
        if(root.val <= left || root.val >= right) {
            return false;
        }
        return isBST(root.left, left, root.val) && isBST(root.right, root.val, right);
    }

    public boolean isComplete(TreeNode root) {

        if(root == null) {
            return true;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        //标记当前节点完不完整
        boolean flag = false;
        while(!deque.isEmpty()) {
            TreeNode pop = deque.pop();
            TreeNode left = pop.left;
            TreeNode right = pop.right;
            //如果当前节点不完整并且该节点不是叶子节点不是完全二叉树，如果当前节点没有左孩子但是有右孩子也不是完全二叉树
            if((flag && !(left == null && right == null)) || (left == null && right != null)) {
                return false;
            }
            if(left != null) {
                deque.addLast(left);
            }
            if(right != null) {
                deque.addLast(right);
            }
            if(left == null || right == null) {
                flag = true;
            }
        }
        return true;
    }

}
