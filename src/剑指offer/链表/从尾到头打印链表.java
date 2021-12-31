package 剑指offer.链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 从尾到头打印链表 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        int length = 0;
        ListNode node1 = listNode;
        while(node1.next != null) {
            length++;
            node1 = node1.next;
        }

        ListNode node2 = listNode;
        int data[] = new int[length + 1];
        int i = 0;
        while(node2.next != null) {
            data[i++] = node2.val;
            node2 = node2.next;
        }

        for(int j = 0;j < length / 2;j++) {
            int temp = data[j];
            data[j] = data[length - j - 1];
            data[length - j - 1] = temp;
        }

        IntStream stream = Arrays.stream(data);
        Stream<Integer> boxed = stream.boxed();
        Integer[] integers = boxed.toArray(Integer[]::new);

        Integer data1[] = new Integer[12];

        ArrayList list = new ArrayList(Arrays.asList(data1));

        return list;
    }

    // 非递归
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        while(listNode != null) {
            arrayList.add(0,listNode.val);
            listNode = listNode.next;
        }

        int integer = arrayList.get(1);

        return arrayList;
    }

    // 用栈做
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();

        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while(!stack.empty()) {
            arrayList.add(stack.pop());
        }

        return arrayList;

    }
}
