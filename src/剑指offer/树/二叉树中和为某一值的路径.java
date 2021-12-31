package 剑指offer.树;

import java.util.ArrayList;
import java.util.Stack;

public class 二叉树中和为某一值的路径 {

    public static void main(String[] args) {

    }

    ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
    Stack<Integer> path = new Stack<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {

        if(root == null) {
            return paths;
        }

        path.push(root.val);
        expectNumber = expectNumber - root.val;

        if(root.left == null && root.right == null && expectNumber == 0) {
            paths.add(new ArrayList<>(path));
        }

        FindPath(root.left,expectNumber);
        FindPath(root.right,expectNumber);

        path.pop();

        return paths;
    }

}
