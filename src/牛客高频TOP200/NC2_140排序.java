package 牛客高频TOP200;

import java.util.Arrays;

public class NC2_140排序 {
    public static void main(String[] args) {
        System.out.println("111");
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("222");
        threadLocal.get();
    }

    // 用Arrays.sort
    public int[] MySort1 (int[] arr) {

        Arrays.sort(arr);

        return arr;
    }

    // 用冒泡排序
    public int[] MySort2 (int[] arr) {

        if(arr == null || arr.length == 0) {
            return null;
        }

        if(arr.length < 2) {
            return arr;
        }

        for(int i = 0;i < arr.length - 1;i++) {
            for(int j = 0;j < arr.length - i - 1;j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr,j,j + 1);
                }
            }
        }

        return arr;
    }

    // 用快排
    public int[] MySort3 (int[] arr) {

        quicksort(arr,0,arr.length - 1);

        return arr;
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

    public int[] MySort4 (int[] arr) {
        mergeSort(arr,0,arr.length - 1);
        return arr;
    }

    public void mergeSort(int[] arr,int l,int r) {
        if(l == r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,r);
        merge(arr,l,r,mid);
    }

    public void merge(int[] arr,int l,int r,int mid) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;

        while(p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while(p1 <= mid) {
            help[i++] = arr[p1++];
        }

        while(p2 <= r) {
            help[i++] = arr[p2++];
        }

        for(i = 0;i < arr.length;i++) {
            arr[l + i] = help[i];
        }
    }

}
