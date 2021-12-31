package 剑指offer.其他算法;

public class 剪绳子 {
    public static void main(String[] args) {

    }

    // 动态规划
    public int cutRope1(int target) {

        int[] dp = new int[target + 1];

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3;i <= target;i++) {
            for(int j = 1;j < i;j++) {
                int temp = Math.max(j * dp[i - j],j * (i - j));
                dp[i] = Math.max(temp,dp[i]);
            }
        }

        return dp[target];
    }

    public int cutRope2(int target) {

        int res = 1;
        for(int i = target / 3;i > 0;i--) {
            res = res * 3;
        }
        if(target % 3 == 2) {
            res = res * 2;
        }
        if(target % 3 == 1) {
            res = res / 3 * 4;
        }

        return res;
    }
}
