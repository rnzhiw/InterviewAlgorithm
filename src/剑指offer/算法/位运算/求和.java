package 剑指offer.算法.位运算;

public class 求和 {
    public static void main(String[] args) {

    }

    public int Sum_Solution(int n) {

        if(n == 1) {
            return n;
        }

        return n + Sum_Solution(n - 1);
    }
}
