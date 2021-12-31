package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC112_98判断t1树中是否有与t2树完全相同的子树 {
    public static void main(String[] args) {

    }

    public boolean isContains (TreeNode root1, TreeNode root2) {
        if(root1 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            //两个根节点不相等，则用root1的左右子树分别和root2比较
            return isContains(root1.left,root2)||isContains(root1.right,root2);
        } else {
            //root1和root2相同，继续对比
            return isSame(root1,root2);
        }
    }

    public boolean isSame(TreeNode root1,TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        }
        //开始找root2是不是root1的子树
        return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
    }

}
