package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC94_107寻找峰值 {
    public static void main(String[] args) {

    }

    //遍历
    public static int findPeakElement1 (int[] nums) {
        int length = nums.length;
        //长度为1的情况
        if(length == 1) {
            return 0;
        }
        //峰值在最前面的情况
        if(nums[0] > nums[1]) {
            return 0;
        }
        //峰值在最后面的情况
        if(nums[length - 1] > nums[length - 2]) {
            return length - 1;
        }
        //在中间的情况
        for(int i = 1;i < length - 1;i++) {
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    //二分法
    public static int findPeakElement2 (int[] nums) {
        int length = nums.length;
        //长度为1的情况
        if(length == 1) {
            return 0;
        }
        //峰值在最前面的情况
        if(nums[0] > nums[1]) {
            return 0;
        }
        //峰值在最后面的情况
        if(nums[length - 1] > nums[length - 2]) {
            return length - 1;
        }
        int left = 0,right = length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else if(nums[mid] > nums[mid + 1]) {
                right = mid - 1;
            }
        }
        return left;
    }
}
