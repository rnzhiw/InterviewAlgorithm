package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC136_23划分链表 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode partition = partition(node, 0);
        System.out.println(partition);
    }

    public static ListNode partition (ListNode head, int x) {
        if(head == null) {
            return null;
        }
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode p1 = node1;
        ListNode p2 = node2;
        //用来遍历
        ListNode p3 = head;
        while(p3 != null) {
            if(p3.val < x) {
                ListNode temp = new ListNode(p3.val);
                p1.next = temp;
                p1 = p1.next;
            } else {
                ListNode temp = new ListNode(p3.val);
                p2.next = temp;
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        p1.next = node2.next;
        p2.next = null;
        return node1.next;
    }
}
