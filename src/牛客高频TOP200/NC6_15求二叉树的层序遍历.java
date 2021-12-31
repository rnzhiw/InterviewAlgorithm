package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC6_15求二叉树的层序遍历 {
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(root == null) {
            return arrayLists;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        while(!deque.isEmpty()) {
            //每一层的结点数量
            arrayList = new ArrayList<>();
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
            arrayLists.add(arrayList);
        }
        return arrayLists;
    }
}
