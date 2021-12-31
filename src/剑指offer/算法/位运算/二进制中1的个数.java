package 剑指offer.算法.位运算;

public class 二进制中1的个数 {
    public static void main(String[] args) {

    }

    public int NumberOf1(int n) {

        String str = Integer.toBinaryString(n);

        int sum = 0;
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '1') {
                sum++;
            }
        }

        return sum;
    }

    public int NumberOf2(int n) {

        int sum = 0;
        while(n != 0) {
            if((n & 1) != 0) {
                sum++;
            }
            n = n >>> 1;
        }

        return sum;
    }

    public int NumberOf3(int n) {

        int sum = 0;
        while(n != 0) {
            n = n & (n - 1);
            sum++;
        }

        return sum;
    }
}
