package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC71_2重排链表 {
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode node1 = new ListNode(0);
        node1.next = head;
        ListNode temp1 = head;
        //定义快慢指针
        ListNode left = head,right = head;
        //找链表中点
        while(right.next != null && right.next.next != null) {
            left = left.next;
            right = right.next.next;
        }
        //连接下一段链表
        ListNode node2 = left.next;
        left.next = null;
        //翻转下一段链表
        node2 = ReverseList1(node2);
        //合并两段链表
        while(node2 != null) {
            //保存下一段链表的下一个节点
            ListNode temp2 = node2.next;
            node2.next = temp1.next;
            temp1.next = node2;
            temp1 = node2.next;
            node2 = temp2;
        }
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
