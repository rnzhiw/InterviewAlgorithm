package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC75_9二叉树中和为某一值的路径1 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum (TreeNode root, int sum) {

        boolean res = dfs(root,sum);

        return res;
    }

    public boolean dfs(TreeNode root,int sum) {
        //目标路径不存在，开始回溯
        if(root == null) {
            return false;
        }
        //更新目标值
        sum = sum - root.val;
        //当当前节点为叶子节点并且路径存在时，返回true
        if(root.left == null && root.right == null && sum == 0) {
            return true;
        }
        //对左右分支进行dfs
        return dfs(root.left,sum) || dfs(root.right,sum);
    }




}
