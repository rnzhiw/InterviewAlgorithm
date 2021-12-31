package 剑指offer.其他算法;

public class 构建乘积数组 {
    public static void main(String[] args) {

    }

    public int[] multiply(int[] A) {

        if(A == null) {
            return null;
        }

        int[] res = new int[A.length];

        for(int i = 0;i < A.length;i++) {
            int ans = 1;
            for(int j = 0;j < A.length;j++) {
                if(i != j) {
                    ans = ans * A[j];
                }
            }
            res[i] = ans;
        }

        return res;
    }

    public int[] constructArr(int[] a) {
        if(a == null || a.length == 0) {
            return new int[]{};
        }
        int[] b = new int[a.length];
        int temp = 1;
        b[0] = 1;
        for(int i = 1;i < a.length;i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for(int i = a.length - 2;i >= 0;i--) {
            temp = temp * a[i + 1];
            b[i] = b[i] * temp;
        }
        return b;
    }
}
