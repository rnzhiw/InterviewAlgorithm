package 剑指offer.算法.搜索算法;

public class 数字在升序数组中出现的次数 {
    public static void main(String[] args) {

    }

    public int GetNumberOfK(int [] array , int k) {

        int a = searchNum(array,k - 0.5);
        int b = searchNum(array,k + 0.5);

        return b - a;
    }

    public int searchNum(int[] array,double m) {

        int start = 0,end = array.length;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(array[mid] > m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
