package 剑指offer.树;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 二叉搜索树的第k个结点 {
    public static void main(String[] args) {

    }

    // BFS
    TreeNode KthNode1(TreeNode pRoot, int k) {

        if(pRoot == null || k <= 0) {
            return null;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        // 临时栈
        Stack<TreeNode> stack = new Stack<>();
        // 存储树所有的结点的结果栈
        Stack<TreeNode> res = new Stack<>();

        deque.push(pRoot);

        // 树中的结点总数
        int totalSize = 0;

        while(!deque.isEmpty()) {
            // 计算每层的结点总数
            int size = deque.size();

            while(size-- > 0) {
                TreeNode pop = deque.pop();
                stack.push(pop);
                res.push(pop);
                if(pop.left != null) {
                    deque.addLast(pop.left);
                }
                if(pop.right != null) {
                    deque.addLast(pop.right);
                }
            }
        }

        totalSize = stack.size();

        // 控制输入的k的范围
        if(k > totalSize) {
            return null;
        }

        int a[] = new int[totalSize];
        int i = 0;
        while(!stack.empty()) {
            a[i++] = stack.pop().val;
        }

        for(int j = 0; j < totalSize - 1;j++) {
            for(int m = j + 1;m < totalSize;m++) {
                if(a[j] >= a[m]) {
                    int temp = a[j];
                    a[j] = a[m];
                    a[m] = temp;
                }
            }
        }

        while(!res.empty()) {
            TreeNode result = res.pop();
            int z = result.val;
            if(z == a[k - 1]) {
                return result;
            }
        }

        return null;
    }

    // 中序遍历法
    TreeNode KthNode2(TreeNode pRoot, int k) {

        if(pRoot == null || k <= 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();

        // 中序遍历过程
        while(!stack.empty() || pRoot != null) {
            while (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            pRoot = stack.pop();
            if(--k == 0){
                return pRoot;
            }
            pRoot = pRoot.right;
        }

        return null;
    }

}
