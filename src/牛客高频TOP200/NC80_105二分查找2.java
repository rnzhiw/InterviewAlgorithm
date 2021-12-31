package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC80_105二分查找2 {
    public static void main(String[] args) {

    }

    public int search (int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0,right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                //找到值以后，往前判断有没有重复的值
                while(mid != 0 && nums[mid] == nums[mid - 1]) {
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }
}
