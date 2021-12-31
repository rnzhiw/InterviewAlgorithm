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
public class NC40_13二叉树的最大深度 {
    public static void main(String[] args) {

    }

    public int maxDepth (TreeNode root) {

        if(root == null) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList arrayList = new ArrayList();

        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        while(!deque.isEmpty()) {
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

        return arrayLists.size();
    }
}
