package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC132_130分糖果问题 {
    public static void main(String[] args) {
        String s1 = "str";
        String s2 = "ing";
        String s3 = "str" + "ing";
        String s4 = "string";
        String s5 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);

        String s6 = new String("123");
        String s7 = new String("123");
        System.out.println(s6 == s7);
    }

    public int candy (int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        if(arr.length == 1) {
            return 1;
        }
        //赋初值
        int[] res = new int[arr.length];
        for(int i = 0;i < arr.length;i++) {
            res[i] = 1;
        }
        //从左往右遍历
        for(int i = 0;i < arr.length - 1;i++) {
            if(arr[i] < arr[i + 1]) {
                res[i + 1] = res[i] + 1;
            }
        }
        //从右往左遍历
        for(int i = arr.length - 1;i > 0;i--) {
            if(arr[i - 1] > arr[i]) {
                res[i - 1] = Math.max(res[i - 1],res[i] + 1);
            }
        }
        int result = 0;
        for(int i = 0;i < arr.length;i++) {
            result = result + res[i];
        }
        return result;
    }
}
