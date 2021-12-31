package 牛客高频TOP200;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC90_10大数乘法 {
    public static void main(String[] args) {

    }

    public String solve1 (String s, String t) {
        BigInteger ss = new BigInteger(s);
        BigInteger tt = new BigInteger(t);
        String res = String.valueOf(ss.multiply(tt));
        return res;
    }

    public String solve2 (String s, String t) {
        String num1 = s,num2 = t;
        // 判断不合法的输入
        if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0) {
            return null;
        }
        // 如果有一个字符串为 0 ，结果就是 0
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        // 最后相乘的结果，长度最多就是 2 个字符串的长度相加
        int[] num = new int[num1.length() + num2.length()];

        // num1 的每一个数字， 和 num2 的每一个数字相乘；  放到 num 数组的对应位置上
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                // 同一个位置可能有多种情况映射过来， 所以结果位置上的结果取个累加和即可
                num[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        // 如果最后的结果有进位，那么 num 数组的第一位数不为零；
        // 如果没进位，则为零。这种情况需要注意不要这个零。
        int end = num[0] == 0 ? 1 : 0;
        StringBuilder res = new StringBuilder();
        // 保存进位的值
        int carry = 0;
        // 从后往前遍历 num 数组，最后的结果有进位则遍历到 0 结束，没进位就遍历到 1 结束。
        for (int i = num.length - 1; i >= end; i--) {
            // 数组上对应位置的数 和 进位相加的结果
            int temp = num[i] + carry;
            // temp的个位数，才是属于对应位置上的数
            res.append(temp % 10);
            // temp的十位数，是属于对应位置的前一个位置上的数，即是进位的值
            carry = temp / 10;
        }
        // 最后的进位不为零，也是计算的结果，往前进 carry 位即可。
        if (carry != 0) {
            res.append(carry);
        }

        // 根据上述的流程，把 res 倒序一下，就是最后 2 个字符串相乘的结果
        return res.reverse().toString();
    }
}
