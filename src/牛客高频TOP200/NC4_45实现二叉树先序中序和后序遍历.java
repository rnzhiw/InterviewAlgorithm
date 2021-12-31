package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC4_45实现二叉树先序中序和后序遍历 {
    public static void main(String[] args) {

    }

    public int[][] threeOrders (TreeNode root) {

        int[][] array = new int[3][];

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        preorder(root,list1);
        inorder(root,list2);
        postorder(root,list3);

        array[0] = new int[list1.size()];
        array[1] = new int[list2.size()];
        array[2] = new int[list3.size()];

        for(int i = 0;i < list1.size();i++) {
            array[0][i] = list1.get(i);
            array[1][i] = list2.get(i);
            array[2][i] = list3.get(i);
        }

        return array;
    }

    public void preorder(TreeNode root,List<Integer> list) {
        if(root != null) {
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }
    }

    public void inorder(TreeNode root,List<Integer> list) {
        if(root != null) {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }

    public void postorder(TreeNode root,List<Integer> list) {
        if(root != null) {
            postorder(root.left,list);
            postorder(root.right,list);
            list.add(root.val);
        }
    }
}
