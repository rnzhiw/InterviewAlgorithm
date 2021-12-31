package 剑指offer.算法.动态规划;

public class 连续子数组的最大和 {
    public static void main(String[] args) {

    }

    // 暴力法
    public int FindGreatestSumOfSubArray1(int[] array) {

        int sum = 0;
        int max = array[0];

        for(int i = 0;i < array.length;i++) {
            sum = 0;
            for(int j = i;j < array.length;j++) {
                sum = sum + array[j];
                max = Math.max(max,sum);
            }
        }

        return max;
    }

    // 动态规划
    public int FindGreatestSumOfSubArray2(int[] array) {

        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = array[0];

        for(int i = 1;i < array.length;i++) {
            dp[i] = Math.max(dp[i - 1] + array[i],array[i]);
            max = Math.max(max,dp[i]);
        }

        return max;
    }

    // 优化动态规划
    public int FindGreatestSumOfSubArray3(int[] array) {

        int sum = array[0];
        int max = array[0];

        for(int i = 1;i < array.length;i++) {
            sum = Math.max(sum + array[i],array[i]);
            max = Math.max(max,sum);
        }

        return max;
    }

}
