package com.learn.datastructures.linkedlist.singlelinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 单向链表
 */

public class SingleLinkedList implements Iterable<Integer> {
    //头节点
    private Node head;

    /**
     * 迭代器
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return head != null;
            }

            @Override
            public Integer next() {
                Node node =head;
                head = head.next;
                return node.data;
            }
        };
    }

    //节点类
    public static  class Node {
        int data;
        Node next;

        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //首部添加
    public void  addFirst(int data) {
        head = new Node (data, head);
    }

    //遍历链表while循环
    public void loopWhile(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.data);
            p = p.next;
        }
    }

    //遍历链表for循环
    public void loopFor(Consumer<Integer> consumer) {
        for (Node p =head;p!=null;p=p.next) {
            consumer.accept(p.data);
        }
    }

    //遍历链表iterator迭代器

}
