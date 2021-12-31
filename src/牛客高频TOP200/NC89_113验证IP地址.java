package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC89_113验证IP地址 {
    public static void main(String[] args) {

    }

    public String solve (String IP) {
        if(IP == null || IP.length() == 0) {
            return "Neither";
        }
        if(IP.indexOf(".") > 0) {
            String[] ss = IP.split("\\.");
            if(ss.length != 4) {
                return "Neither";
            }
            for(int i = 0;i < ss.length;i++) {
                for(int j = 0;j < ss[i].length();j++) {
                    char c = ss[i].charAt(j);
                    if(!(c >= '0' && c <= '9')) {
                        return "Neither";
                    }
                }
                if(Integer.parseInt(ss[i]) > 255 || (ss[i].charAt(0) == '0' && ss[i].length() > 1)) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else if(IP.indexOf(":") > 0) {
            String[] ss = IP.split("\\:");
            if(ss.length != 8) {
                return "Neither";
            }
            for(int i = 0;i < ss.length;i++) {
                if(ss[i].equals("") || ss[i].length() > 4) {
                    return "Neither";
                }
            }
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}
