package 剑指offer.链表;

import java.util.Stack;

public class 反转链表 {
    public static void main(String[] args) {

    }

    // 双指针
    public ListNode ReverseList1(ListNode head) {

        if(head == null) {
            return head;
        }
        ListNode pre = null,cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    // 递归
    public ListNode ReverseList2(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = ReverseList2(head.next);

        head.next.next = head;

        head.next = null;

        return newHead;

    }

    // 使用栈
    public ListNode ReverseList3(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        ListNode node = new ListNode(0);
        temp = node;

        while(!stack.empty()) {
            ListNode cur = new ListNode(stack.pop());
            temp.next = cur;
            temp = temp.next;
        }

        return node.next;

    }



}
