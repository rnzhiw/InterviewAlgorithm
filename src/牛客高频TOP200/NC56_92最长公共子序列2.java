package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC56_92最长公共子序列2 {
    public static void main(String[] args) {

    }

    public String LCS (String s1, String s2) {

        if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
            return "-1";
        }
        //统计字符串s1和s2的长度
        int length1 = s1.length();
        int length2 = s2.length();
        String[][] dp = new String[length1 + 1][length2 + 1];
        //给dp数组边界赋值
        for(int i = 0;i <= length1;i++) {
            dp[i][0] = "";
        }
        for(int j = 0;j <= length2;j++) {
            dp[0][j] = "";
        }
        for(int i = 1;i <= length1;i++) {
            for(int j = 1;j <= length2;j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
                } else {
                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        if(dp[length1][length2] == "") {
            return "-1";
        } else {
            return dp[length1][length2];
        }
    }
}
