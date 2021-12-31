package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC100_110旋转数组 {
    public static void main(String[] args) {

    }

    public int[] solve (int n, int m, int[] a) {
        if(a == null || a.length == 0 || m < 0) {
            return null;
        }
        int k = m % n;
        reverse(a,0,n - 1);
        reverse(a,0,k - 1);
        reverse(a,k,n - 1);
        return a;
    }

    public void reverse(int[] a,int start,int end){
        while (start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
