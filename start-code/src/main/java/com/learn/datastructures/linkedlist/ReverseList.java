package com.learn.datastructures.linkedlist;

/**
 * 反转链表
 */
public class ReverseList {

    static ListNode reverseList1(ListNode head) {
        ListNode n1 = null;
        ListNode p = head;
        while (p != null) {
            n1 = new ListNode(p.val, n1);
            p = p.next;
        }
        return n1;
    }

    static ListNode reverseList2(ListNode head) {
        List l1 = new List(head);
        List l2 = new List(null);
        while (true) {
            ListNode first = l1.removeFirst();
            if (first == null) {
                break;
            }
            l2.addFirst(first);
        }
        return l2.head;
    }

    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public ListNode removeFirst() {
            ListNode l1 = head;
            if (l1 != null) {
                head = l1.next;
            }
            return l1;
        }

        public void addFirst(ListNode l2) {
            l2.next = head;
            head = l2;
        }
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        System.out.println(o1);
        ListNode n1 = new ReverseList().reverseList2(o1);
        System.out.println(n1);
    }
}
