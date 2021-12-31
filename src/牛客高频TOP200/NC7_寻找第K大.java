package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC7_寻找第K大 {
    public static void main(String[] args) {

    }

    //使用快排寻找第K大的数
    public int findKth(int[] a, int n, int K) {
        quicksort(a,0,n - 1);
        return a[n - K];
    }

    public void quicksort(int[] list,int left,int right) {

        if(left < right) {
            int point = partition(list,left,right);
            quicksort(list,left,point - 1);
            quicksort(list,point + 1,right);
        }
    }

    public int partition(int[] list,int left,int right) {
        int first = list[left];
        while(left < right) {
            while(left < right && list[right] >= first) {
                right--;
            }
            swap(list, left, right);
            while(left < right && list[left] <= first) {
                left++;
            }
            swap(list, left, right);
        }
        return left;
    }

    public void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
