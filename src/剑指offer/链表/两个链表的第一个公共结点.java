package 剑指offer.链表;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class 两个链表的第一个公共结点 {
    public static void main(String[] args) {

    }

    // 暴力法
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {

        for(ListNode ph1 = pHead1;ph1 != null;ph1 = ph1.next) {
            for(ListNode ph2 = pHead2;ph2 != null;ph2 = ph2.next) {
                if(ph1 == ph2) {
                    return ph1;
                }
            }
        }

        return null;
    }

    // 使用栈
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {

        if(pHead1 == null || pHead2 == null) {
            return null;
        }

        ListNode ph1 = pHead1,ph2 = pHead2;

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(ph1 != null) {
            stack1.push(ph1.val);
            ph1 = ph1.next;
        }

        while(ph2 != null) {
            stack2.push(ph2.val);
            ph2 = ph2.next;
        }

        if(!stack1.peek().equals(stack2.peek())) {
            return null;
        }

        while(!stack1.empty() && !stack2.empty()) {

            int p1 = stack1.peek();
            int p2 = stack2.peek();
            if(p1 != p2) {
                return findValue(pHead1,p1);
            }
            stack1.pop();
            stack2.pop();
        }

        // 考虑两个链表完全一样的情况
        if(stack1.empty() && stack2.empty()) {
            return pHead1;
        }

        // 考虑一个链表是另一个链表的子链表的情况
        if(!stack1.empty() && stack2.empty()) {
            return findValue(pHead1,stack1.peek());
        }

        if(stack1.empty() && !stack2.empty()) {
            return findValue(pHead2,stack2.peek());
        }

        return null;

    }

    public ListNode findValue(ListNode pHead1,int val) {

        while(pHead1 != null) {
            if(pHead1.val == val) {
                return pHead1.next;
            }
            pHead1 = pHead1.next;
        }

        return null;
    }

    // 使用set
    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {

        Set<ListNode> set = new HashSet<>();

        while(pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }

        while(pHead2 != null && !set.contains(pHead2)) {
            pHead2 = pHead2.next;
        }

        return pHead2;

    }

    // 使用差值法
    public ListNode FindFirstCommonNode4(ListNode pHead1, ListNode pHead2) {

        int c1 = 0,c2 = 0;
        ListNode p1 = pHead1,p2 = pHead2;

        while(p1 != null) {
            p1 = p1.next;
            c1++;
        }

        while(p2 != null) {
            p2 = p2.next;
            c2++;
        }

        int d = c1 - c2;

        if(d > 0) {
            while(d-- > 0) {
                pHead1 = pHead1.next;
            }
        } else if(d < 0) {
            d = -d;
            while(d-- > 0) {
                pHead2 = pHead2.next;
            }
        }

        while(pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;

    }

    // 使用等值法
    public ListNode FindFirstCommonNode5(ListNode pHead1, ListNode pHead2) {

        ListNode p1 = pHead1,p2 = pHead2;

        while(p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }

        return p1;

    }
}
