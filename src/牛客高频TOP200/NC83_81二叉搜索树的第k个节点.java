package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC83_81二叉搜索树的第k个节点 {
    public static void main(String[] args) {

    }

    List<Integer> list = new ArrayList<>();
    public int KthNode (TreeNode proot, int k) {
        if(proot == null || k <= 0) {
            return -1;
        }
        inorder(proot);
        //排除k要大于list数组的长度的情况
        if(k > list.size()) {
            return -1;
        }
        return list.get(k - 1);
    }

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
