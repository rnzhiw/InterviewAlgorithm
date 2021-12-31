package 牛客高频TOP200;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC133_104比较版本号 {
    public static void main(String[] args) {

    }

    public int compare (String version1, String version2) {
        if(version1 == null || version2 == null || version1.length() == 0 || version2.length() == 0) {
            return 0;
        }

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        for(int i = 0;i < Math.max(v1.length,v2.length);i++) {
            BigInteger r1 = i < v1.length ? new BigInteger(v1[i]) : new BigInteger("0");
            BigInteger r2 = i < v2.length ? new BigInteger(v2[i]) : new BigInteger("0");
            if(r1.compareTo(r2) < 0) {
                return -1;
            } else if(r1.compareTo(r2) > 0) {
                return 1;
            }
        }
        return 0;
    }
}
