package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC86_132环形链表的约瑟夫问题 {
    public static void main(String[] args) {

    }

    public int ysf (int n, int m) {
        List<Integer> list = new LinkedList<>();
        for(int i = 1;i <= n;i++) {
            list.add(i);
        }
        int cur = 0;
        while(list.size() > 1) {
            int size = list.size();
            int pos = (cur + m - 1) % size;
            list.remove(pos);
            cur = pos % (size - 1);
        }
        return list.get(0);
    }
}
