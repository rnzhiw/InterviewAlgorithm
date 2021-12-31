package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC137_106三个数的最大乘积 {
    public static void main(String[] args) {

    }

    public long solve (int[] A) {
        // 最小的和第二小的
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        // 最大的、第二大的和第三大的
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // 顺序遍历查找最小的两个数、最大的三个数
        for(int i = 0;i < A.length;i ++){
            if(A[i] < min1){
                //更新最小值
                min2 = min1;
                min1 = A[i];
            }else if(A[i] < min2){
                //更新第二小
                min2 = A[i];
            }
            if (A[i] > max1){
                //更新最大值
                max3 = max2;
                max2 = max1;
                max1 = A[i];
            }else if(A[i] > max2){
                //更新第二大
                max3 = max2;
                max2 = A[i];
            }else if(A[i] > max3){
                //更新第三大
                max3 = A[i];
            }
        }
        return Math.max((long)min1 * min2 * max1,(long) max1 * max2 * max3);
    }
}
