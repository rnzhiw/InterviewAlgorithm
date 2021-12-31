package 剑指offer.链表;

import java.util.HashMap;
import java.util.Map;

public class 复杂链表的复制 {

    public static void main(String[] args) {

    }

    public RandomListNode Clone(RandomListNode pHead) {



        return null;
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) {
            return head;
        }
        RandomListNode cur = head;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        while(cur != null) {
            map.put(cur,new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

}
