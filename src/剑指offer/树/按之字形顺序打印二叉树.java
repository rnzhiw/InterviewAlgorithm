package 剑指offer.树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 按之字形顺序打印二叉树 {
    public static void main(String[] args) {

    }

    // BFS
    public ArrayList<ArrayList<Integer>> Print1(TreeNode pRoot) {

        // 先在前面定义，不要直接返回null，判断pRoot以后直接返回arrayLists
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        if(pRoot == null) {
            return arrayLists;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();

        deque.push(pRoot);

        // 用于计数
        int count = 0;

        while(!deque.isEmpty()) {
            // 每层结点的数量
            int size = deque.size();

            ArrayList<Integer> arrayList = new ArrayList<>();

            while(size-- > 0) {
                TreeNode pop = deque.pop();

                // 如果是第奇数层
                if(count % 2 == 0) {
                    arrayList.add(pop.val);
                } else {
                    stack.push(pop);
                }
                if(pop.left != null) {
                    deque.addLast(pop.left);
                }
                if(pop.right != null) {
                    deque.addLast(pop.right);
                }


            }

            if(count % 2 == 1) {
                while(!stack.isEmpty()) {
                    TreeNode pop1 = stack.pop();
                    arrayList.add(pop1.val);
                }
            }

            count++;

            arrayLists.add(arrayList);

        }

        return arrayLists;
    }

    public ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        travel(pRoot,res,0);

        return res;
    }

    public void travel(TreeNode node,ArrayList<ArrayList<Integer>> res,int level) {
        if(node == null) {
            return;
        }
        if(res.size() < level) {
            ArrayList<Integer> newLevel = new ArrayList<>();
            res.add(newLevel);
        }
        ArrayList<Integer> arrayList = res.get(level);
        if(level % 2 == 0) {
            arrayList.add(node.val);
        } else {
            arrayList.add(0,node.val);
        }
        travel(node.left,res,level + 1);
        travel(node.right,res,level +1);
    }

}
