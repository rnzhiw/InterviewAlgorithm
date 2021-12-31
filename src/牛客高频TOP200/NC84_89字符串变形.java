package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC84_89字符串变形 {
    public static void main(String[] args) {

    }

    public String trans(String s, int n) {
        if(s == null || s.length() == 0) {
            return s;
        }
        String[] ss = s.split(" ",-1);
        StringBuilder sb = new StringBuilder();
        for(int i = ss.length - 1;i >= 0;i--) {
            String temp = "";
            for(int j = 0;j < ss[i].length();j++) {
                char c = ss[i].charAt(j);
                if(c >= 'a' && c <= 'z') {
                    temp += Character.toUpperCase(c);
                } else if(c >= 'A' && c <= 'Z') {
                    temp += Character.toLowerCase(c);
                }
            }
            sb.append(temp);
            if(i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
