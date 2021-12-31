package 牛客高频TOP200;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC51_5二叉树根节点到叶子节点的所有路径和 {
    public static void main(String[] args) {

    }

    public int sumNumbers1 (TreeNode root) {

        int sum = 0;
        if(root == null) {
            return sum;
        }
        return preorderSum(root,sum);
    }

    public int sumNumbers2 (TreeNode root) {

        int sum = 0;
        if(root == null) {
            return sum;
        }
        Deque<TreeNode> nodeDeque = new LinkedList<>();
        Deque<Integer> valueDeque = new LinkedList<>();
        nodeDeque.push(root);
        valueDeque.push(root.val);
        while(!nodeDeque.isEmpty()) {
            TreeNode nodePop = nodeDeque.pop();
            int valuePop = valueDeque.pop();
            //如果是叶子节点
            if(nodePop.left == null && nodePop.right == null) {
                sum = sum + valuePop;
            }
            if(nodePop.left != null) {
                nodeDeque.push(nodePop.left);
                valueDeque.push(valuePop * 10 + nodePop.left.val);
            }
            if(nodePop.right != null) {
                nodeDeque.push(nodePop.right);
                valueDeque.push(valuePop * 10 + nodePop.right.val);
            }
        }
        return sum;
    }

    public int preorderSum(TreeNode root,int sum) {

        if(root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) {
            return sum;
        }
        return preorderSum(root.left,sum) + preorderSum(root.right,sum);
    }
}
