package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC134_149kmp算法 {
    public static void main(String[] args) {

    }

    //主串位置
    int i = 0;
    //模板串位置
    int j = 0;
    //统计次数
    int count = 0;
    public int kmp1 (String S, String T) {

        while(find1(S,T) == 1) {
            i = i - j + 1;
            j = 0;
        }
        return count;
    }

    public int kmp2 (String S, String T) {
        int res = 0;
        int[] next = new int[S.length()];
        getNext(next, S);
        int j = 0;
        int i = 0;
        while (i < T.length()) {
            // 退到头或相等，i指针往后
            if (j == 0 || T.charAt(i) == S.charAt(j)){
                i++;
                j++;
            }
            else {
                // j回退，防止溢出
                if (j == 0) {
                    j = 0;
                }
                else {
                    j = next[j - 1];
                }
            }
            if (j == S.length()){
                // 找到一个子串，j回退
                res++;
                j = next[j - 1];
            }
        }
        return res;
    }

    public int find1(String S,String T) {

        while(i < T.length() && j < S.length()) {
            if(T.charAt(i) == S.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if(j == S.length()) {
            count++;
            return 1;
        }
        return 0;
    }

    public void getNext(int next[], String S){
        int j = 0;
        next[0] = 0; // 初始化
        for (int i = 1; i < S.length(); i++) {
            // 前缀不相同时；注意此处回退循环，退到相等
            while (j > 0 && S.charAt(i) != S.charAt(j)) {
                j = next[j - 1];
            }
            // 前缀相同时，更新前缀指针和next数组
            if (S.charAt(i) == S.charAt(j)) {
                j++;
                next[i] = j;
            }
        }
    }
}
