package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC57_36在两个长度相等的排序数组中找到上中位数 {
    public static void main(String[] args) {

    }

    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {

        int length = arr1.length,midIndex = arr1.length;
        //记录总的次数
        int index = 0;
        //存放返回的值
        int res = 0;
        //记录两个数组的起点
        int index1 = 0,index2 = 0;
        while(index1 < length && index2 < length) {
            if(arr1[index1] <= arr2[index2]) {
                res = arr1[index1];
                index1++;
            } else {
                res = arr2[index2];
                index2++;
            }
            index++;
            if(index == midIndex) {
                return res;
            }
        }
        return 0;
    }
}
