package 牛客高频TOP200;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC130_84完全二叉树结点数 {
    public static void main(String[] args) {

    }

    ArrayList<TreeNode> list = new ArrayList<>();
    public int nodeNum(TreeNode head) {
        if(head == null) {
            return 0;
        }
        dfs(head);
        return list.size();
    }

    public void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }

}
