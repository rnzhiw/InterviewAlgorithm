package 牛客高频TOP200;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC82_123序列化二叉树 {
    public static void main(String[] args) {

    }

    int INF = 0x3f3f3f3f;
    TreeNode emptyNode = new TreeNode(INF);
    String Serialize(TreeNode root) {
        if(root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while(!deque.isEmpty()) {
            TreeNode pop = deque.pop();
            sb.append(pop.val + "_");
            if(!pop.equals(emptyNode)) {
                deque.addLast(pop.left != null ? pop.left : emptyNode);
                deque.addLast(pop.right != null ? pop.right : emptyNode);
            }
        }
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        if(str.equals("")) {
            return null;
        }
        String[] ss = str.split("_");
        int n = ss.length;
        TreeNode root = new TreeNode(Integer.parseInt(ss[0]));
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        for(int i = 0;i < n - 1;i++) {
            TreeNode pop = deque.pop();
            //每次取出当前结点和下一个结点
            int a = Integer.parseInt(ss[i]),b = Integer.parseInt(ss[i + 1]);
            if(a != INF) {
                pop.left = new TreeNode(a);
                deque.addLast(pop.left);
            }
            if(b != INF) {
                pop.right = new TreeNode(b);
                deque.addLast(pop.right);
            }
        }
        return root;
    }
}
