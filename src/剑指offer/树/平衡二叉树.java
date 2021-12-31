package 剑指offer.树;

public class 平衡二叉树 {
    public static void main(String[] args) {

    }

    public boolean IsBalanced_Solution(TreeNode root) {

        if(root == null) {
            return true;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        if(Math.abs(left - right) > 1) {
            return false;
        } else {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }

    }

    public int depth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        return Math.max(depth(root.left),depth(root.right)) + 1;

    }


}
