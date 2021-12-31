package 牛客高频TOP200;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC93_126兑换零钱1 {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        int aim = 20;
        int res = minMoney(arr,aim);
        System.out.println(res);
    }

    public static int minMoney (int[] arr, int aim) {
        int max = aim + 1;
        int[] dp = new int[aim + 1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i = 1;i <= aim;i++) {
            for(int j = 0;j < arr.length;j++) {
                if(i - arr[j] >= 0) {
                    dp[i] = Math.min(dp[i],dp[i - arr[j]] + 1);
                }
            }
        }
        return dp[aim] == 21 ? -1 : dp[aim];
    }
}
