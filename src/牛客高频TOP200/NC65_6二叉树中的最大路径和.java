package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC65_6二叉树中的最大路径和 {
    public static void main(String[] args) {

    }

    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftGain = Math.max(maxGain(root.left),0);
        int rightGain = Math.max(maxGain(root.right),0);
        int newPricePath = root.val + leftGain + rightGain;
        maxSum = Math.max(maxSum,newPricePath);
        return root.val + Math.max(leftGain,rightGain);
    }
}
