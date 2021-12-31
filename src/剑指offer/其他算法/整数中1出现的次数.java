package 剑指offer.其他算法;

public class 整数中1出现的次数 {
    public static void main(String[] args) {

    }

    public int NumberOf1Between1AndN_Solution(int n) {

        int ans = 0;

        for(int i = 1;i <= n;i++) {
            ans = ans + getSum(i);
        }

        return ans;
    }

    public int getSum(int x) {

        int sum = 0;

        while(x != 0) {
            if(x % 10 == 1) {
                sum++;
            }
            x = x / 10;
        }

        return sum;
    }
}
