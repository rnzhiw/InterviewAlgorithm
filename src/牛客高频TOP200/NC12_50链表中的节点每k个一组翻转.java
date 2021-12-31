package 牛客高频TOP200;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC12_50链表中的节点每k个一组翻转 {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup (ListNode head, int k) {

        if(head == null || head.next == null || k <= 0) {
            return head;
        }

        Stack<Integer> stack = new Stack<>();

        //统计链表长度
        ListNode temp1 = head;
        //统计入栈情况
        ListNode temp2 = head;
        //获得最后剩余元素的头指针
        ListNode temp3 = head;

        //统计链表的长度
        int length = 0;
        while(temp1 != null) {
            temp1 = temp1.next;
            length++;
        }

        //如果链表长度小于k，直接返回头结点
        if(length < k) {
            return head;
        }

        //统计链表成对和最后剩几个元素
        int lastSize = length % k;
        int firstSize = length - lastSize;

        for(int i = 0;i < firstSize;i++) {
            temp3 = temp3.next;
        }

        ListNode node = new ListNode(0);
        temp1 = node;

        //统计入栈几次
        int times = length / k;
        for(int i = 0;i < times;i++) {
            for(int j = 0;j < k;j++) {
                stack.push(temp2.val);
                temp2 = temp2.next;
            }
            while(!stack.empty()) {
                ListNode cur = new ListNode(stack.pop());
                temp1.next = cur;
                temp1 = temp1.next;
            }
        }

        if(lastSize != 0) {
            temp1.next = temp3;
        }

        return node.next;
    }
}
