package cn.com.zcc.datastructure.list;

/**
 * 合并有序链表
 */
public class TestTwo {

    /**
     * 采用递归
     */
    public static ListNode mergeTwoList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
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
    }

    /**
     * 采用非递归
     *
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode mergeTwoList2(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 != null ? head1 : head2;   //任何一个为null,返回另一个LIST
        }


        ListNode head = head1.value < head2.value ? head1 : head2; //定义head为第一个元素较小的LIST
        ListNode curl = head == head1 ? head1 : head2;  // 把head指向curl当前LIST
        ListNode curlother = head == head1 ? head2 : head1;         //另一个LIST

        ListNode pre = null;    //curl前一个元素
        ListNode next = null;   //curl 后一个元素
        while (curl != null && curlother != null) {
            if (curl.value <= curlother.value) {
                pre = curl;
                curl = curl.next;
            } else {
                next = curlother.next;
                pre.next = curlother;
                curlother.next = curl;
                pre = curlother;
                curlother = next;
            }
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
//            System.out.println("**************curlother***************");
//            MyList.traverse(curlother);
//            System.out.println("**************curlother***************");
//
//            System.out.println("**************head***************");
//            MyList.traverse(head);
//            System.out.println("**************head***************");
//            System.out.println();
//            System.out.println();

        }

        pre.next = curl == null ? curlother : curl;
        return head;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        node1.next = node6;
        node6.next = node7;

        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        MyList.traverse(mergeTwoList(node2, node1));
        MyList.traverse(mergeTwoList2(node2, node1));
    }
}
