package 剑指offer.算法.动态规划;

public class 跳台阶 {
    public static void main(String[] args) {

    }

    // 递归
    public int jumpFloor1(int target) {

        if(target == 1 || target == 2) {
            return target;
        }

        return jumpFloor1(target - 1) + jumpFloor1(target - 2);
    }

    // 动态规划
    public int jumpFloor2(int target) {

        if(target == 1 || target == 2) {
            return target;
        }

        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3;i <= target;i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[target];
    }

    // 优化的动态规划
    public int jumpFloor3(int target) {

        if(target == 1 || target == 2) {
            return target;
        }

        int first = 1;
        int second = 2;
        int sum = 0;

        for(int i = 3;i <= target;i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }

    // 公式法
    public int jumpFloor4(int target) {

        double sqrt = Math.sqrt(5);
        return (int) ((Math.pow((1 + sqrt) / 2, target + 1) - Math.pow((1 - sqrt) / 2, target + 1)) / sqrt);
    }

}
