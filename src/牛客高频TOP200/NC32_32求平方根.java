package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC32_32求平方根 {
    public static void main(String[] args) {

    }

    //直接用库
    public int sqrt1 (int x) {
        return (int) Math.sqrt(x);
    }

    public int sqrt2 (int x) {
        double l = 0,r = x;
        while(r - l > 0.00001){
            double mid = (l + r) / 2;
            if(mid * mid > x){
                r = mid;
            } else{
                l = mid;
            }
        }
        return (int)r;
    }


}
