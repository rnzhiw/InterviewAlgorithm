package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC53_21链表内指定区间反转 {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween (ListNode head, int m, int n) {
        if(head == null || m <= 0 || n <= 0) {
            return null;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode preStart = node;
        ListNode start = head;
        for(int i = 1;i < m;i++) {
            preStart = preStart.next;
            start = start.next;
        }
        for(int i = 0;i < n - m;i++) {
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = preStart.next;
            preStart.next = temp;
        }
        return node.next;
    }

    // 双指针
    public ListNode ReverseList1(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode node = head;

        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
}
