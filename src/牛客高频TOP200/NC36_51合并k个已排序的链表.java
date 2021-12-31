package 牛客高频TOP200;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC36_51合并k个已排序的链表 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists == null || lists.size() == 0) {
            return null;
        }
        PriorityQueue<ListNode> heap = new PriorityQueue<>((o1,o2) -> {return o1.val - o2.val;});
        for(ListNode list : lists) {
            //防止出现空指针异常
            if(list != null) {
                heap.add(list);
            }
        }
        ListNode node = new ListNode(0);
        ListNode temp = node;
        while(!heap.isEmpty()) {
            //从优先队列中出一个链表
            ListNode cur = heap.poll();
            temp.next = cur;
            cur = cur.next;
            temp = temp.next;
            if(cur != null) {
                heap.add(cur);
            }
        }
        return node.next;
    }
}
