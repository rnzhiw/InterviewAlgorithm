package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC16_22合并两个有序的数组 {
    public static void main(String[] args) {

    }

    //复杂度较高的合并
    public void merge1(int A[], int m, int B[], int n) {
        int c[] = new int[m + n];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n) {
            if(A[i] <= B[j]) {
                c[k++] = A[i++];
            } else {
                c[k++] = B[j++];
            }
        }
        while(i < m) {
            c[k++] = A[i++];
        }
        while(j < n) {
            c[k++] = B[j++];
        }
        for(int s = 0;s < m + n;s++) {
            A[s] = c[s];
        }
    }

    //复杂度较低的合并
    public void merge2(int A[], int m, int B[], int n) {
        int end = m + n - 1,i = m - 1,j = n - 1;
        while(end >= 0 && i >= 0 && j >= 0) {
            if(A[i] > B[j]) {
                A[end--] = A[i--];
            } else {
                A[end--] = B[j--];
            }
        }
        //只考虑B数组还有剩余的即可
        while(j >= 0) {
            A[end--] = B[j--];
        }
    }
}
