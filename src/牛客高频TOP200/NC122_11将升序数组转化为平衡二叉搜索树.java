package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC122_11将升序数组转化为平衡二叉搜索树 {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST (int[] num) {
        if(num == null || num.length == 0) {
            return null;
        }
        TreeNode node = dfs(num, 0, num.length - 1);
        return node;
    }

    public TreeNode dfs(int[] num,int begin,int end) {
        if(begin > end) {
            return null;
        }
        int mid = (begin + end) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = dfs(num,begin,mid - 1);
        node.right = dfs(num,mid + 1,end);
        return node;
    }
}
