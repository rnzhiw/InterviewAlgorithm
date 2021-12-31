package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC19_53删除链表的倒数第n个节点 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd (ListNode head, int n) {

        if(head == null) {
            return head;
        }

        if(head.next == null && n == 1) {
            return null;
        }

        //统计链表长度
        ListNode temp = head;
        //慢指针
        ListNode slow = head;
        //快指针
        ListNode fast = head;

        ListNode node = new ListNode(0);
        slow = node;
        slow.next = head;

        //统计链表的长度
        int length = 0;
        while(temp != null) {
            temp = temp.next;
            length++;
        }

        //定义慢指针停留点
        int slowIndex = length - n;
        int fastIndex = length - n;
        while(slowIndex-- > 0) {
            slow = slow.next;
        }
        while(fastIndex-- > 0) {
            fast = fast.next;
        }
        slow.next = fast.next;

        return node.next;
    }
}
