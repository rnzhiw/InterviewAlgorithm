package 剑指offer.算法.模拟;

public class 把字符串转换成整数 {
    public static void main(String[] args) {

    }

    public int StrToInt(String str) {

        if(str == null || str.length() == 0) {
            return 0;
        }

        char[] chars = str.toCharArray();

        int sign = 0;
        boolean isPlus = false;

        if(chars[0] == '+') {
            sign = 1;
            isPlus = true;
        } else if(chars[0] == '-') {
            sign = 1;
            isPlus = false;
        } else if(Character.isDigit(chars[0])) {
            sign = 0;
        } else {
            return 0;
        }

        int len = chars.length;
        int num = 0;

        for(int i = sign;i < len;i++) {
            if(Character.isDigit(chars[i])) {
                num = (int)(num + ((int)chars[i] - 48) * Math.pow(10,len - i - 1));
            } else {
                return 0;
            }
        }

        if(sign == 0) {
            return num;
        } else if(sign == 1 && isPlus == true) {
            return num;
        } else {
            return -num;
        }
    }
}
