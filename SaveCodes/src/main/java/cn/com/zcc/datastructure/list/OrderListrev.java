package cn.com.zcc.datastructure.list;


public class OrderListrev {

    private static ListNode merge2(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 != null ? head1 : head2;
        }

        ListNode head = head1.value < head2.value ? head1 : head2;

        ListNode curl = head == head1 ? head1 : head2;
        ListNode other = head == head2 ? head2 : head1;

        ListNode pre = null;
        ListNode next = null;

        while (curl != null && other != null) {
            if (curl.value <= other.value) {
                pre = curl;
                curl = curl.next;
            } else {
                next = other.next;
                pre.next = other;
                other.next = curl;
                pre = other;
                other = next;
            }
        }

        pre.next = curl == null ? other : curl;


        return head;
    }

    private static ListNode getMid(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    private static ListNode ordernode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        System.out.println("xxxxx");
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;
        //MyList.traverse(head);
        //MyList.traverse(right);
        ListNode node = merge2(ordernode(head), ordernode(right));
        //MyList.traverse(node);
        return node;
    }

    public static void main2(String[] args) {

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

        ListNode ooo = ordernode(node1);
        MyList.traverse(ooo);

        System.out.println("ssssssssssss");

    }

//**********************************************************************************************************
//**********************************************************************************************************
//**********************************************************************************************************
//**********************************************************************************************************
//**********************************************************************************************************

    //找到中间点，然后分割
    public ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        //快慢指针
        ListNode slow, fast;
        slow = fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 合并排好序的链表
    public ListNode merge(ListNode a, ListNode b) {
        ListNode dummyHead, curr;
        dummyHead = new ListNode(0);
        curr = dummyHead;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a == null) ? b : a;
        return dummyHead.next;
    }


    //单链表的归并排序
    public ListNode merge_sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //得到链表中间的数
        ListNode middle = getMiddle(head);
        ListNode sHalf = middle.next;
        //拆分链表
        middle.next = null;
        //递归调用
        ListNode headbak = head;
        System.out.print("headbak"+"\t");

        while (headbak.next != null) {
            System.out.print(headbak.val + "\t");
            headbak = headbak.next;
        }
        System.out.println();
        ListNode sHalfbak = sHalf;
        System.out.print("sHalfbak"  +"\t");
        while (sHalfbak.next != null) {
            System.out.print(sHalfbak.val + "\t");
            sHalfbak = sHalfbak.next;
        }
        System.out.println();
        return merge(merge_sort(head), merge_sort(sHalf));
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(8);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(1);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        ListNode p = head;
        while (p.next != null) {
            System.out.print(p.val + "\t");
            p = p.next;
        }
        System.out.print(p.val + "\t");
        System.out.println();

        new OrderListrev().merge_sort(head);

        p = head;
        while (p != null) {
            System.out.print(p.val + "\t");
            p = p.next;
        }

        //main2(null);
    }


}
