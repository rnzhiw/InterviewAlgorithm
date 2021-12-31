package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC64_133链表的奇偶重排 {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList (ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        //计算链表的长度
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode node = new ListNode(0);
        ListNode temp3 = node;
        int length = 0;
        while(temp1 != null) {
            length++;
            temp1 = temp1.next;
        }
        int[] res = new int[length];
        //将链表中的数据存入到数组
        int num = 0;
        while(temp2 != null) {
            res[num++] = temp2.val;
            temp2 = temp2.next;
        }
        //构建第一部分的链表
        for(int i = 0;i < length;i++) {
            if(i % 2 == 0) {
                ListNode cur = new ListNode(res[i]);
                temp3.next = cur;
                temp3 = temp3.next;
            }
        }
        //构建第二部分的链表
        for(int i = 0;i < length;i++) {
            if(i % 2 == 1) {
                ListNode cur = new ListNode(res[i]);
                temp3.next = cur;
                temp3 = temp3.next;
            }
        }
        return node.next;
    }
}
