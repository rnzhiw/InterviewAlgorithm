package 牛客高频TOP200;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC24_40两个链表生成相加链表 {
    public static void main(String[] args) {

    }

    public ListNode addInList (ListNode head1, ListNode head2) {
        ListNode node = new ListNode(0);
        int carry = 0;
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode cur = node;
        while (head1 != null || head2 != null || carry > 0) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            sum += carry;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            cur.next = newNode;
            cur = cur.next;
        }
        return reverse(node.next);
    }

    public ListNode reverse(ListNode head) {
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
