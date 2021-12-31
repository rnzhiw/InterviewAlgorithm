package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC49_96判断一个链表是否为回文结构 {
    public static void main(String[] args) {

    }

    public boolean isPail1 (ListNode head) {

        if(head == null) {
            return false;
        }

        ListNode temp1 = head;
        ListNode temp2 = head;

        //计算链表的长度
        int length = 0;
        while(temp1 != null) {
            length++;
            temp1 = temp1.next;
        }
        //存放链表中的数据
        int[] res = new int[length];
        for(int i = 0;i < length;i++) {
            res[i] = temp2.val;
            temp2 = temp2.next;
        }
        boolean ans = isPalindrome(res);
        return ans;
    }

    public boolean isPail2 (ListNode head) {

        ListNode q= head, p= head;
        //通过快慢指针找到中点
        while (q != null && q.next != null) {
            q = q.next.next;
            p = p.next;
        }
        //如果q不为空，说明链表的长度是奇数个
        if (q != null) {
            p = p.next;
        }
        //反转后半部分链表
        p = reverse(p);

        q = head;
        while (p != null) {
            //然后比较，判断节点值是否相等
            if (q.val != p.val) {
                return false;
            }
            q = q.next;
            p = p.next;
        }
        return true;
    }

    //判断子串是不是回文子串
    public boolean isPalindrome(int[] res){
        int length = res.length;
        for(int i = 0; i < length/2; i++){
            if(res[i] != res[length - i - 1]) { //不相等
                return false;
            }
        }
        return true;
    }

    // 双指针
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode node = head;
        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
