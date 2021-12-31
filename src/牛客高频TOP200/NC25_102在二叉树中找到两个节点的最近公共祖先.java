package 牛客高频TOP200;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC25_102在二叉树中找到两个节点的最近公共祖先 {
    public static void main(String[] args) {

    }

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {

        Map<Integer,Integer> parent = new HashMap<>();
        Deque<TreeNode> deque = new LinkedList<>();

        parent.put(root.val,Integer.MAX_VALUE);
        deque.push(root);

        //如果map里面都没有o1和o2结点
        while(!parent.containsKey(o1) || !parent.containsKey(o2)) {
            TreeNode node = deque.pop();
            if(node.left != null) {
                parent.put(node.left.val,node.val);
                deque.push(node.left);
            }
            if(node.right != null) {
                parent.put(node.right.val,node.val);
                deque.push(node.right);
            }
        }

        //用于存储o1的所有祖先结点
        Set<Integer> set = new HashSet<>();
        while(parent.containsKey(o1)) {
            set.add(o1);
            o1 = parent.get(o1);
        }
        //查看o1和他的祖先节点有没有包括o2,如果不包括的话再看有没有包括o2的祖先节点
        while(!set.contains(o2)) {
            o2 = parent.get(o2);
        }

        return o2;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null) {
            return right;
        } else if(right == null) {
            return left;
        } else {
            return root;
        }
    }
}
