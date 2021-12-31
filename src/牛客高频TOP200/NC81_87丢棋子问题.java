package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC81_87丢棋子问题 {
    public static void main(String[] args) {

    }

    public int solve (int n, int k) {
        int t = 1;
        while(calF(k,t) < n + 1) {
            t++;
        }
        return t;
    }

    public int calF(int k,int t) {
        if(k == 1 || t == 1) {
            return t + 1;
        }
        return calF(k - 1,t - 1) + calF(k,t - 1);
    }
}
