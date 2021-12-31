package 剑指offer.链表;

import java.util.Arrays;
import java.util.HashSet;

public class 合并两个排序的链表 {
    public static void main(String[] args) {
        HashSet
    }

    public ListNode Merge1(ListNode list1,ListNode list2) {

        int size1 = 0;
        int size2 = 0;

        ListNode list3 = list1;
        ListNode list4 = list2;
        ListNode list5 = list1;
        ListNode list6 = list2;

        while(list3 != null) {
            list3 = list3.next;
            size1++;
        }

        while(list4 != null) {
            list4 = list4.next;
            size2++;
        }

        int a[] = new int[size1 + size2];

        int i = 0;
        while(list5 != null) {
            a[i++] = list5.val;
            list5 = list5.next;
        }
        while(list6 != null) {
            a[i++] = list6.val;
            list6 = list6.next;
        }

        Arrays.sort(a);

        ListNode node = new ListNode(0);
        ListNode temp = node;

        for(int j = 0;j < size1 + size2;j++) {
            ListNode cur = new ListNode(a[j]);
            temp.next = cur;
            temp = temp.next;
        }

        return node.next;
    }

    // 递归
    public ListNode Merge2(ListNode list1,ListNode list2) {

        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        if(list1.val <= list2.val) {
            list1.next = Merge2(list1.next,list2);
            return list1;
        } else {
            list2.next = Merge2(list1,list2.next);
            return list2;
        }
    }

    // 迭代
    public ListNode Merge3(ListNode list1,ListNode list2) {

        ListNode p1 = list1;
        ListNode p2 = list2;

        ListNode node = new ListNode(0);
        ListNode temp = node;

        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                ListNode cur = new ListNode(p1.val);
                temp.next = cur;
                p1 = p1.next;
                temp = temp.next;
            } else {
                ListNode cur = new ListNode(p2.val);
                temp.next = cur;
                p2 = p2.next;
                temp = temp.next;
            }
        }

        if(p1 != null) {
            temp.next = p1;
        } else if(p2 != null) {
            temp.next = p2;
        }

        return node.next;
    }
}
