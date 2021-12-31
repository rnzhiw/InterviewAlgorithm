package 牛客高频TOP200;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC103_39N皇后问题 {
    public static void main(String[] args) {

    }

    Set<Integer> column = new HashSet<>();
    Set<Integer> pos1 = new HashSet<>();
    Set<Integer> pos2 = new HashSet<>();

    int result = 0;

    public int Nqueen (int n) {
        compute(0,n);
        return result;
    }

    public void compute(int i,int n) {
        if(i == n) {
            result++;
            return;
        }
        for(int j = 0;j < n;j++) {
            if(column.contains(j) || pos1.contains(i - j) || pos2.contains(i + j)) {
                continue;
            }
            column.add(j);
            pos1.add(i - j);
            pos2.add(i + j);
            compute(i + 1,n);
            column.remove(j);
            pos1.remove(i - j);
            pos2.remove(i + j);
        }
    }
}
