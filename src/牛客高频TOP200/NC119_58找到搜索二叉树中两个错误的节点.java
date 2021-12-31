package 牛客高频TOP200;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC119_58找到搜索二叉树中两个错误的节点 {
    public static void main(String[] args) {

    }

    ArrayList<TreeNode> list = new ArrayList<>();
    public int[] findError (TreeNode root) {
        int[] res = new int[2];
        if(root == null) {
            return res;
        }
        inorder(root);
        if(list.size() == 1) {
            return res;
        }
        int i = 0,j = 0;
        for(i = 0;i < list.size() - 1;i++) {
            if(list.get(i).val > list.get(i + 1).val) {
                res[1] = list.get(i).val;
                break;
            }
        }
        for(j = list.size() - 1;j > i;j--) {
            if(list.get(j).val < list.get(j - 1).val) {
                res[0] = list.get(j).val;
                break;
            }
        }
        return res;
    }

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder((root.right));
    }

}
