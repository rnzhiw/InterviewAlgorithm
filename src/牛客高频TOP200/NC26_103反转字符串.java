package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC26_103反转字符串 {
    public static void main(String[] args) {

    }

    public String solve (String str) {
        int i = 0,j = str.length() - 1;
        while(i < j) {
            swap(str.charAt(i++),str.charAt(j--));
        }
        return str;
    }

    public void swap(char a,char b) {
        char temp = a;
        a = b;
        b = temp;
    }
}
