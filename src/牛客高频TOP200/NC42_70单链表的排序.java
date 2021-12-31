package 牛客高频TOP200;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC42_70单链表的排序 {
    public static void main(String[] args) {

    }

    //加辅助数组
    public ListNode sortInList1 (ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        //记录链表的长度
        int length = 0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode temp3 = head;
        while(temp1 != null) {
            temp1 = temp1.next;
            length++;
        }
        //用来存链表中的数据
        int[] res = new int[length];
        int index = 0;
        for(int i = 0;i < length;i++) {
            res[index++] = temp2.val;
            temp2 = temp2.next;
        }
        Arrays.sort(res);
        for(int i = 0;i < length;i++) {
            temp3.val = res[i];
            temp3 = temp3.next;
        }
        return head;
    }

    //用优先级队列
    public ListNode sortInList2 (ListNode head) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((n1, n2) -> {return n1.val - n2.val;});
        while (head != null) {
            heap.add(head);
            head = head.next;
        }
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        while (!heap.isEmpty()) {
            cur.next = heap.poll();
            cur = cur.next;
        }
        cur.next = null;
        return node.next;
    }
}
