package 剑指offer.其他算法;

import java.util.Deque;
import java.util.LinkedList;

public class 调整数组顺序使奇数位于偶数前面1 {
    public static void main(String[] args) {

    }

    // 用队列
    public int[] reOrderArray1 (int[] array) {

        int[] res = new int[array.length];
        if(array == null || array.length == 0) {
            return res;
        }

        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();

        for(int i = 0;i < array.length;i++) {
            if(array[i] % 2 == 1) {
                deque1.addLast(array[i]);
            } else {
                deque2.addLast(array[i]);
            }
        }

        int k = 0;

        while(!deque1.isEmpty()) {
            res[k++] = deque1.pop();
        }

        while(!deque2.isEmpty()) {
            res[k++] = deque2.pop();
        }

        return res;
    }

    // 用数组
    public int[] reOrderArray (int[] array) {
        int i = 0;
        for (int j=0; j < array.length; ++j) {
            // 遇到奇数时
            if (array[j] % 2 == 1) {
                // 先将 array[j] 赋值
                int tmp = array[j];
                // 将 【i, j-1】数组后移动
                for (int k=j-1; k>=i; --k) {
                    array[k+1] = array[k];
                }
                // 将array[j]插入到 i++ 的位置
                array[i++] = tmp;
            }
        }
        return array;
    }

    //双指针
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        if(nums == null || nums.length == 0) {
            return res;
        }
        int i = 0,j = nums.length - 1;
        while(i < j) {
            while(i < j && nums[i] % 2 == 1) {
                i++;
            }
            while(i < j && nums[j] % 2 == 0) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

}
