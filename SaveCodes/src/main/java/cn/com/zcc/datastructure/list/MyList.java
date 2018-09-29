package cn.com.zcc.datastructure.list;

public class MyList {
    /**
     * 头结点的插入
     */
    public static void headInsert(ListNode head, ListNode newHead) {
        ListNode old = head;
        head = newHead;
        head.next = old;
    }

    /**
     * 尾结点的插入
     */
    public static void tailInsert(ListNode tail, ListNode newTail) {
        ListNode old = tail;
        tail = newTail;
        tail.next = null;
        old.next = tail;
    }

    /**
     * 遍历
     */
    public static void traverse(ListNode head) {
        while (null != head) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    /**
     * 遍历查询
     */
    public static int find(ListNode head, int value) {
        int index = -1;
        int count = 0;
        while (null != head) {
            if (value == head.value) {
                index = count;
                return index;
            }
            count++;
            head = head.next;
        }
        return index;
    }

    /**
     * 插入
     */
    public static void insert(ListNode p, ListNode s) {
        ListNode next = p.next;
        p.next = s;
        s.next = next;
    }

    /**
     * 删除
     */

    public static void delete(ListNode head, ListNode q) {
        if (null != q && null != q.next) {
            ListNode p = q.next;
            q.value = p.value;
            //删除q.next
            q.next = p.next;
            p = null;
        }
        if (null == q.next) {
            while (null != head) {
                if (null != head.next && head.next == q) {
                    head.next = null;
                    break;
                }
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        traverse(node1);

        ListNode newhead = new ListNode(0);
        headInsert(node1, newhead);
        traverse(newhead);

        ListNode newtail = new ListNode(4);
        tailInsert(node3, newtail);
        traverse(newhead);

        System.out.println(find(newhead, 3));

        ListNode node5 = new ListNode(5);
        insert(node3, node5);
        traverse(newhead);

        delete(newhead, node3);
        traverse(newhead);

    }
}
