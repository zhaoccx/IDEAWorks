package cn.com.zcc.datastructure.list;

/**
 * 合并有序链表
 */
public class TestTwo {

    /**
     * 采用递归
     *
     * @param head1 链表之一
     * @param head2 链表之一
     * @return 合并后的链表
     */
    private static ListNode mergeTwoList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        }

        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        ListNode head;
        if (head1.value > head2.value) {
            head = head2;
            head.next = mergeTwoList(head1, head2.next);
        } else {
            head = head1;
            head.next = mergeTwoList(head1.next, head2);
        }

        return head;
    }

    /**
     * 采用非递归
     * 把一个链表合并到另一个链表。。
     *
     * @param head1 链表之一
     * @param head2 链表之一
     * @return 合并后的链表
     */
    private static ListNode mergeTwoList2(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 != null ? head1 : head2;   //任何一个为null,返回另一个ListNode
        }


        ListNode head = head1.value < head2.value ? head1 : head2; //定义head为第一个元素较小的ListNode
        ListNode curl = head == head1 ? head1 : head2;  // 把head指向curl当前ListNode
        ListNode other = head == head1 ? head2 : head1;         //另一个ListNode

        ListNode pre = null;    //curl前一个元素
        ListNode next = null;   //other 后一个元素
        while (curl != null && other != null) {
            if (curl.value <= other.value) {
                pre = curl;
                curl = curl.next;

            } else {
                next = other.next;
                pre.next = other;
                other.next = curl;
                pre = pre.next; // pre = other;
                other = next;
            }

            System.out.println("head=" + getValue(head) + ",curl=" + getValue(curl) + ",other=" + getValue(other) + ",pre=" + getValue(pre) + ",next=" + getValue(next));
//            System.out.println("**************pre***************");
//            MyList.traverse(pre);
//            System.out.println("**************pre***************");
//            System.out.println("**************next***************");
//            MyList.traverse(next);
//            System.out.println("**************next***************");
//
//            System.out.println("**************curl***************");
//            MyList.traverse(curl);
//            System.out.println("**************curl***************");
//            System.out.println("**************other***************");
//            MyList.traverse(other);
//            System.out.println("**************other***************");
//
//            System.out.println("**************head***************");
//            MyList.traverse(head);
//            System.out.println("**************head***************");
//            System.out.println();
//            System.out.println();

        }

        pre.next = curl == null ? other : curl;
        return head;
    }

    /**
     * 采用非递归 ，新建一个链表。。。。
     *
     * @param head1 链表之一
     * @param head2 链表之一
     * @return 合并后的链表
     */
    private static ListNode mergeTwoList3(ListNode head1, ListNode head2) {

        if (null == head1 || null == head2) {
            return null == head1 ? head2 : head1;
        }
        ListNode head = new ListNode(-1);

        ListNode headtemp = head;
        while (null != head1 && null != head2) {
            if (head1.value < head2.value) {
                head.next = head1;
                head1 = head1.next;
                head = head.next;
            } else {
                head.next = head2;
                head2 = head2.next;
                head = head.next;
            }
        }
        head.next = null == head1 ? head2 : head1;
        return headtemp.next;
    }


    private static int getValue(ListNode listNode) {
        if (listNode == null) {
            return 0;
        } else {
            return listNode.value;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);


        node1.next = node4;
        node4.next = node7;

        node2.next = node3;
        node3.next = node5;
        node5.next = node6;
        node6.next = node8;

//        MyList.traverse(mergeTwoList(node2, node1));
        MyList.traverse(mergeTwoList2(node2, node1));
//        MyList.traverse(mergeTwoList3(node1, node2));

    }
}
