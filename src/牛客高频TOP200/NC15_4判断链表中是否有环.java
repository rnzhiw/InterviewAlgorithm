package 牛客高频TOP200;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC15_4判断链表中是否有环 {
    public static void main(String[] args) {

    }

    //用set
    public boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(!set.contains(temp)) {
                set.add(temp);
                temp = temp.next;
            } else {
                return true;
            }
        }
        return false;
    }

    //用快慢指针
    public boolean hasCycle2(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head,fast = head;
        while(fast != null) {
            fast = fast.next;
            if(fast == null) {
                return false;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
