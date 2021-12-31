package 剑指offer.其他算法;

public class 打印从1到最大的n位数 {
    public static void main(String[] args) {

    }

    public int[] printNumbers (int n) {

        if(n < 1) {
            return null;
        }

        int res = 9;
        while(--n > 0) {
            res = res * 10 + 9;
        }

        int[] result = new int[res];

        int cnt = 0;
        for(int i = 0;i < res;i++) {
            result[cnt++] = i + 1;
        }

        return result;
    }
}
