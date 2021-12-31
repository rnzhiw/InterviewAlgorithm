package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC106_83子数组最大乘积 {
    public static void main(String[] args) {

    }

    public double maxProduct(double[] arr) {
        if(arr == null || arr.length == 0) {
            return 0.0;
        }
        double[] max = new double[arr.length];
        double[] min = new double[arr.length];
        max[0] = arr[0];
        min[0] = arr[0];
        double res = arr[0];
        for(int i = 1;i < arr.length;++i) {
            max[i] = Double.max(arr[i],Double.max(arr[i] * max[i - 1],arr[i] * min[i - 1]));
            min[i] = Double.min(arr[i],Double.min(arr[i] * max[i - 1],arr[i] * min[i - 1]));
            res = Double.max(max[i],res);
        }
        return res;
    }
}
