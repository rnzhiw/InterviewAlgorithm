package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC39_109岛屿数量 {
    public static void main(String[] args) {

    }

    public int solve (char[][] grid) {

        if(grid == null || grid.length == 0) {
            return 0;
        }

        //统计岛屿的个数
        int num = 0;
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                if(grid[i][j] == '1') {
                    num++;
                    dfs(grid,i,j);
                }
            }
        }
        return num;
    }

    public void dfs(char[][] grid,int i,int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        //向上
        dfs(grid,i - 1,j);
        //向下
        dfs(grid,i + 1,j);
        //向左
        dfs(grid,i,j - 1);
        //向右
        dfs(grid,i,j + 1);
    }
}
