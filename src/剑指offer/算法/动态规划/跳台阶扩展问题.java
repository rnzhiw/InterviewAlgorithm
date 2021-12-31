package 剑指offer.算法.动态规划;

public class 跳台阶扩展问题 {
    public static void main(String[] args) {

    }

    public int jumpFloorII(int target) {

        int ans = 1;
        for(int i = 1; i<target;i++) {
            ans += jumpFloorII(target-i);  //计算f(number-1)
        }
        return ans;

    }
}
