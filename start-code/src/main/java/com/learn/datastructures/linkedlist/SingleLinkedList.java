package com.learn.datastructures.linkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 单向链表
 */

public class SingleLinkedList implements Iterable<Integer> {
    //头节点
    private Node head;

    //节点类
    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //首部添加
    public void addFirst(int data) {
        head = new Node(data, head);
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
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.data);
        }
    }

    /**
     * 遍历链表iterator迭代器
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
                Node node = head;
                head = head.next;
                return node.data;
            }
        };
    }

    //寻找最后一位的位置
    private Node findLast() {
        if (head == null) {
            return null;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    //向最后一位进行添加
    public void addLast(int data) {
        Node last = findLast();
        if (last == null) {
            addFirst(data);
            return;
        }
        last.next = new Node(data, null);
    }

    //查找索引位置所在的节点
    private Node findNode(int index) {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    //根据索引位置获取值
    public int get(int index) {
        Node p = findNode(index);
        if (p == null) {
            throw new IllegalArgumentException(String.format("Index [%d] out of bounds%n", index));
        }
        return p.data;
    }


    //指定索引位置插入
    public void insert(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node preNode = findNode(index - 1);
        if (preNode == null) {
            throw new IllegalArgumentException(String.format("Index [%d] out of bounds%n", index));
        }
        preNode.next = new Node(data, preNode.next);
    }

    //删除首位节点
    public void removeFirst() {
        if (head == null) {
            throw new IllegalArgumentException(String.format("Index [%d] out of bounds%n", 0));
        }
        head = head.next;
    }

    //指定索引位置删除
    public void removeByIndex(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node preNode = findNode(index - 1);
        if (preNode == null) {
            throw new IllegalArgumentException(String.format("Index [%d] out of bounds%n", index));
        }
        Node delNode = preNode.next;
        if (delNode == null) {
            throw new IllegalArgumentException(String.format("Index [%d] out of bounds%n", index));
        }
        preNode.next = delNode.next;
    }

}
