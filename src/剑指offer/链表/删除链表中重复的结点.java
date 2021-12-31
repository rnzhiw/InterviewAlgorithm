package 剑指offer.链表;

import java.util.*;

public class 删除链表中重复的结点 {

    public static void main(String[] args) {

    }

    // 双指针加set法
    public ListNode deleteDuplication1(ListNode pHead) {

        if(pHead == null) {
            return null;
        }

        ListNode pre = pHead,cur = pHead.next;
        Set<Integer> set = new HashSet<>();

        while(cur != null) {
            if(pre.val == cur.val) {
                set.add(pre.val);
            }
            pre = cur;
            cur = cur.next;
        }

        // 删除头结点
        while(pHead != null && set.contains(pHead.val)) {
            pHead = pHead.next;
        }

        // 删除头结点后防止链表中所有结点值都相同的情况
        if(pHead == null) {
            return null;
        }

        pre = pHead;
        cur = pHead.next;

        // 删除中间节点
        while(cur != null) {
            if(set.contains(cur.val)) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }

        }

        return pHead;
    }

    public ListNode deleteDuplication2(ListNode pHead) {

        if(pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode head = new ListNode(Integer.MAX_VALUE);
        head.next = pHead;

        ListNode pre = head;
        ListNode cur = head.next;

        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }

        return head.next;
    }
}
