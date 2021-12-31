package 剑指offer.算法.回溯;

public class 矩阵中的路径 {
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0] == null || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }
        char[] cs = word.toCharArray();
        for(int i = 0;i < board.length;i++) {
            for(int j = 0;j < board[i].length;j++) {
                if(dfs(board,cs,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,char[] cs,int i,int j,int curIndex) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != cs[curIndex]) {
            return false;
        }
        if(curIndex == cs.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        boolean res = (dfs(board,cs,i + 1,j,curIndex + 1) ||
                dfs(board,cs,i - 1,j,curIndex + 1) ||
                dfs(board,cs,i,j + 1,curIndex + 1) ||
                dfs(board,cs,i,j - 1,curIndex + 1));
        board[i][j] = cs[curIndex];
        return res;
    }
}
