package 牛客高频TOP200;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC59_24删除有序链表中重复的元素2 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates1 (ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        Map<Integer,Integer> map = new LinkedHashMap<>();
        //遍历链表
        ListNode temp1 = head;

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
            if(entry.getValue() == 1) {
                ListNode cur = new ListNode(entry.getKey());
                temp2.next = cur;
                temp2 = temp2.next;
            }
        }

        return node.next;
    }

    //用双指针
    public ListNode deleteDuplicates2 (ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node,cur = head;
        while(cur != null && cur.next != null) {
            //如果前后不相等，同时往后移动一位
            if(cur.val != cur.next.val) {
                pre = cur;
                cur = cur.next;
            } else {
                //找到值相同的节点最后一个
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                if(cur.next == null) {
                    pre.next = null;
                    break;
                }
                //删除相同的节点
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return node.next;
    }
}
