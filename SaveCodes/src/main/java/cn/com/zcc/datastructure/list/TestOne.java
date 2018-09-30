package cn.com.zcc.datastructure.list;

import java.util.List;

public class TestOne {

    /**
     * 反转链表
     * O(n),O(1)
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null; // 当前节点的上一个结点;
        ListNode next = null; // 当前节点的下一个;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;

    }

    /**
     * 取中间值
     * @param head
     * @return
     */
    public static ListNode getMid(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        System.out.println(getMid(node1).value);

        MyList.traverse(reverseList(node1));
    }
}
