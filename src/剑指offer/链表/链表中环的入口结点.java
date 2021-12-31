package 剑指offer.链表;

import java.util.HashSet;
import java.util.Set;

public class 链表中环的入口结点 {
    public static void main(String[] args) {

    }

    // 双指针法
    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        ListNode slow = pHead;//快指针
        ListNode fast = pHead;//慢指针
        while (fast != null && fast.next != null) {
            //快慢指针，快指针每次走两步，慢指针每次走一步
            fast = fast.next.next;
            slow = slow.next;
            //先判断是否有环，
            if (slow == fast) {
                //确定有环之后才能找环的入口
                while (pHead != slow) {
                    //两指针，一个从头结点开始，
                    //一个从相遇点开始每次走一步，直到
                    //再次相遇为止
                    pHead = pHead.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    // 使用set
    public ListNode EntryNodeOfLoop2(ListNode pHead) {

        Set<ListNode> set = new HashSet<>();

        ListNode node = pHead;

        while(node != null) {
            if(!set.contains(node)) {
                set.add(node);
                node = node.next;
            } else {
                return node;
            }
        }

        return null;
    }

}
