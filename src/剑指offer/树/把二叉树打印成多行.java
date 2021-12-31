package 剑指offer.树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 把二叉树打印成多行 {
    public static void main(String[] args) {

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList arrayList = new ArrayList();

        if(pRoot == null) {
            return arrayLists;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(pRoot);

        while(!deque.isEmpty()) {
            // 每一层的结点数量
            int size = deque.size();

            arrayList = new ArrayList();

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
            arrayLists.add(arrayList);
        }

        return arrayLists;
    }

}
