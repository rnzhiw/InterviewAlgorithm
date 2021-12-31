package 牛客高频TOP200;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC117_64二叉搜索树与双向链表 {
    public static void main(String[] args) {

    }

    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        inorder(pRootOfTree);
        arrayList.get(arrayList.size() - 1).right = null;
        arrayList.get(0).left = null;
        for(int i = 0;i < arrayList.size() - 1;i++) {
            arrayList.get(i).right = arrayList.get(i + 1);
        }
        for(int i = 1;i < arrayList.size();i++) {
            arrayList.get(i).left = arrayList.get(i - 1);
        }
        return arrayList.get(0);
    }

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        arrayList.add(root);
        inorder(root.right);
    }

}
