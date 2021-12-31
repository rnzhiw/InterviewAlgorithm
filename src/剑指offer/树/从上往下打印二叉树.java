package 剑指offer.树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 从上往下打印二叉树 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(root == null) {
            return arrayList;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        while(!deque.isEmpty()) {

            // 每一层的结点数量
            int size = deque.size();

            while(size-- > 0) {
                TreeNode pop = deque.pop();
                arrayList.add(pop.val);
                if(pop.left != null) {
                    deque.addLast(pop.left);
                }
                if(pop.right != null) {
                    deque.addLast(pop.right);
                }
            }

        }

        return arrayList;
    }
}
