package 牛客高频TOP200;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC72_25删除有序链表中重复的元素1 {
    public static void main(String[] args) {

    }

    //用map
    public ListNode deleteDuplicates1 (ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        //遍历链表
        ListNode temp1 = head;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        while(temp1 != null) {
            if(!map.containsKey(temp1.val)) {
                map.put(temp1.val,1);
            } else {
                map.put(temp1.val,map.get(temp1.val) + 1);
            }
            temp1 = temp1.next;
        }
        ListNode temp2 = new ListNode(0);
        ListNode node = temp2;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ListNode cur = new ListNode(entry.getKey());
            temp2.next = cur;
            temp2 = temp2.next;
        }
        return node.next;
    }

    //用双指针
    public ListNode deleteDuplicates2 (ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode node = new ListNode(0);
        node.next = head;
        while(temp1 != null) {
            if(temp1.next != null && temp1.val == temp1.next.val) {
                temp1.next = temp1.next.next;
            } else {
                temp1 = temp1.next;
            }
        }
        return node.next;
    }
}
