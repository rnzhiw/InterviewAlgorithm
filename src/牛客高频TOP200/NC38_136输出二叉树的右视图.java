package 牛客高频TOP200;


import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC38_136输出二叉树的右视图 {
    public static void main(String[] args) {

    }

    public int[] solve (int[] xianxu, int[] zhongxu) {

        if(xianxu == null || zhongxu == null || xianxu.length == 0 || zhongxu.length == 0) {
            return null;
        }

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        //统计二叉树最右边的结点个数
        int num = 0;

        //根据先序和中序重建二叉树的根节点
        TreeNode root = reConstructBinaryTree(xianxu,zhongxu);
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
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

        int[] res = new int[arrayLists.size()];
        for(ArrayList list : arrayLists) {
            res[num++] = (int)list.get(list.size() - 1);
        }

        return res;
    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        if(pre.length == 0 || vin.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0;i < vin.length;i++) {
            if(pre[0] == vin[i]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i + 1),Arrays.copyOfRange(vin,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i + 1,pre.length),Arrays.copyOfRange(vin,i + 1,vin.length));
                break;
            }
        }
        return root;
    }
}
