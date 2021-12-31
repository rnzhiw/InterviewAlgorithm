package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC95_28最小覆盖子串 {
    public static void main(String[] args) {

    }

    public String minWindow (String S, String T) {
        if(S == null || S.length() == 0 || T == null || T.length() == 0 || S.length() < T.length()) {
            return "";
        }
        int[] map = new int[128];
        //将字符串T出现的次数存到map里
        for(int i = 0;i < T.length();i++) {
            map[T.charAt(i)]++;
        }
        int begin = 0,end = 0,d = Integer.MAX_VALUE,count = T.length(),head = 0;
        while(end < S.length()) {
            if(map[S.charAt(end++)]-- > 0) {
                count--;
            }
            while(count == 0) {
                if(end - begin < d) {
                    d = end - begin;
                    head = begin;
                }
                if(map[S.charAt(begin++)]++ == 0) {
                    count++;
                }
            }
        }
        return d == Integer.MAX_VALUE ? "" : S.substring(head,head + d);
    }
}
