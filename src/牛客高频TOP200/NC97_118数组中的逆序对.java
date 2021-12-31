package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC97_118数组中的逆序对 {
    public static void main(String[] args) {

    }

    //暴力
    public int InversePairs1(int [] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        int res = 0;
        for(int i = 0;i < array.length - 1;i++) {
            for(int j = i + 1;j < array.length;j++) {
                if(array[i] > array[j]) {
                    res++;
                    res = res % 1000000007;
                }
            }
        }
        return res;
    }

    //归并排序
    int count = 0;
    public int InversePairs2(int [] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        mergeSort(array,0,array.length - 1);
        return count;
    }

    void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        // 取p到r之间的中间位置q,防止（p+r）的和超过int类型最大值
        int mid = left + (right - left) / 2;

        // 分治递归
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        // 将arr[p...q]和arr[q+1...r]合并为arr[p...r]
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
                //存在逆序对
                count = count + mid + 1 - i;
                count = count % 1000000007;
            }
        }

        while(i <= mid) {
            tmp[k++] = arr[i++];
        }

        while(j <= right) {
            tmp[k++] = arr[j++];
        }

        for(i = 0;i < tmp.length;i++){
            arr[left + i] = tmp[i];
        }
    }
}
