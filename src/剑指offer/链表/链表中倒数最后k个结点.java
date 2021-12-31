package 剑指offer.链表;

import java.util.Stack;

public class 链表中倒数最后k个结点 {
    public static void main(String[] args) {

    }

    // 遍历法
    public ListNode FindKthToTail1 (ListNode pHead, int k) {

        int size = 0;
        ListNode node = pHead;
        while(node != null) {
            size++;
            node = node.next;
        }
        if(size < k || k == 0) {
            return null;
        }
        int i = 0;
        while(i < size - k + 1 && pHead != null) {
            pHead = pHead.next;
        }
        return pHead;

    }

    // 使用栈
    public ListNode FindKthToTail2 (ListNode pHead, int k) {

        // 预处理
        int size = 0;
        ListNode listNode = pHead;
        while(listNode != null) {
            size++;
            listNode = listNode.next;
        }
        if(size < k || k == 0) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode node = pHead;
        ListNode rs = null;
        while(node != null) {
            stack.push(node);
            node = node.next;
        }

        while(k-- > 0) {
           rs = stack.pop();
        }

        return rs;

    }

    // 快慢指针
    public ListNode FindKthToTail3 (ListNode pHead, int k) {

        // 预处理
        int size = 0;
        ListNode listNode = pHead;
        while(listNode != null) {
            size++;
            listNode = listNode.next;
        }
        if(size < k || k == 0) {
            return null;
        }

        ListNode fast = pHead,slow = pHead;
        while(k-- > 0) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }
}
