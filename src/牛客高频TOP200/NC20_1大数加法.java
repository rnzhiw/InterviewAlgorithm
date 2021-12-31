package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC20_1大数加法 {
    public static void main(String[] args) {

    }

    public String solve (String s, String t) {

        int carry = 0,i = s.length() - 1,j = t.length() - 1;
        StringBuffer sb = new StringBuffer();
        while(carry >= 0 || i >= 0 || j >= 0) {
            int c1 = i >= 0 ? s.charAt(i) - '0' : 0;
            int c2 = j >= 0 ? t.charAt(j) - '0' : 0;
            int num = c1 + c2 + carry;
            carry = num / 10;
            sb.append(num % 10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
