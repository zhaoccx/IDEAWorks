package cn.com.zcc.datastructure.list;

/**
 * 一个链表，奇数位升序，偶数位降序，对链表进行排序
 * 1 8 3 6 5 4 7 2 9
 * 1 2 3 4 5 6 7 8 9
 * O(n)
 * 分成三步
 * 1、按照奇数和偶数拆分
 * 2、对偶数为反转
 * 3、合并两个链表
 */
public class OrderList {


    /**
     * 拆分链表
     *
     * @param head 参数
     * @return 数组
     */
    private static ListNode[] getList(ListNode head) {
        ListNode head1 = null, head2 = null, curl1 = null, curl2 = null;
        int count = 1;//计数

        while (head != null) {
            if (count % 2 == 1) {
                if (curl1 != null) {
                    curl1.next = head;
                    curl1 = curl1.next;
                } else {
                    curl1 = head;
                    head1 = curl1;
                }
            } else {
                if (curl2 != null) {
                    curl2.next = head;
                    curl2 = curl2.next;
                } else {
                    curl2 = head;
                    head2 = curl2;
                }

            }
            head = head.next;
            count++;
        }

        if (curl1 != null)
        curl1.next = null;
        if (curl2 != null)
        curl2.next = null;
        return new ListNode[]{head1, head2};

    }

    /**
     * 反转链表
     *
     * @param head 参数
     * @return 返回
     */
    private static ListNode reverseList(ListNode head) {
        ListNode pre = null, next ;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;


    }

    private static ListNode mergeTwoList(ListNode head1, ListNode head2) {

        if (null == head1 && null == head2) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        ListNode head = null;
        if (head1.value > head2.value) {
            head = head2;
            head.next = mergeTwoList(head1, head2.next);
        } else {
            head = head1;
            head.next = mergeTwoList(head1.next, head2);
        }

        return head;
//
//        if (head1 == null && head2 == null) {
//
//            return null;
//        }
//
//
//        if (head1 == null) {
//            return head2;
//        }
//
//        if (head2 == null) {
//            return head1;
//        }
//
//        ListNode head;
//        if (head1.value > head2.value) {
//            head = head2;
//            head.next = mergeTwoList(head1, head2.next);
//        } else {
//            head = head1;
//            head.next = mergeTwoList(head1.next, head2);
//        }
//
//        return head;


//        return null;


    }

    private static ListNode init() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(2);
        ListNode node9 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;


        return node1;
    }

    public static void main(String[] args) {

        ListNode[] nodes = getList(init());
        MyList.traverse(nodes[0]);
        MyList.traverse(nodes[1]);
        ListNode node2 = reverseList(nodes[1]);
        MyList.traverse(node2);
        ListNode node = mergeTwoList(nodes[0], node2);
        MyList.traverse(node);


    }
}