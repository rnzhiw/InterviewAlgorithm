package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC78_55最长公共前缀 {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix (String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        int rows = strs.length;
        int cols = strs[0].length();
        for(int i = 0;i < cols;i++) {
            char firstChar = strs[0].charAt(i);
            for(int j = 1;j < rows;j++) {
                if(strs[j].length() == i || strs[j].charAt(i) != firstChar) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
