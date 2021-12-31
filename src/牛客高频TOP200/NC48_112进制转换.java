package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC48_112进制转换 {
    public static void main(String[] args) {

    }

    public String solve (int M, int N) {

        if(M == 0) {
            return "0";
        }
        String s = "0123456789ABCDEF";
        StringBuffer sb = new StringBuffer();
        boolean f = false;
        if(M < 0) {
            f = true;
            M = -M;
        }
        while(M != 0) {
            sb.append(s.charAt(M % N));
            M = M / N;
        }
        if(f) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
