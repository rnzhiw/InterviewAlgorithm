package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC33_48在旋转过的有序数组中寻找目标值 {
    public static void main(String[] args) {

    }

    public int search (int[] nums, int target) {

        int left = 0,right = nums.length - 1;
        int mid = 0;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[left] <= nums[mid]) {
                //left到mid有序
                if(target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //从mid到right有序
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
