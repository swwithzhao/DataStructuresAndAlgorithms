package com.learn.datastructures.linkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 带哨兵节点的单向链表
 */
public class SingleLinkedListSentinel  implements Iterable<Integer>{
    private Node head = new Node(Integer.MIN_VALUE, null);

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    //指定索引位置插入
    public void insert(int index, int data) {
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        prev.next = new Node(data, prev.next);
    }

    //头部插入
    public void addFirst(int data) {
        insert(0, data);
    }

    //遍历链表while循环
    public void loopWhile(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.data);
            p = p.next;
        }
    }

    //遍历链表for循环
    public void loopFor(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next) {
            consumer.accept(p.data);
        }
    }
    //迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node node = head.next;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Integer next() {
                int value = node.data;
                node = node.next;
                return value;
            }
        };
    }

    //寻找最后位置
    private Node findLast() {
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    //向最后一位添加
    public void addLast(int data) {
        Node last = findLast();
        last.next = new Node(data, last.next);
    }

    //根据索引位置获取值
    public int getValue(int index) {
        Node p = findNode(index);
        if (p == null) {
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        return p.data;
    }

    //指定索引位置插入
    public void insertByIndex(int index, int data) {
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        prev.next = new Node(data, prev.next);
    }
    //删除首位节点
    public void removeFirst() {
        removeByIndex(0);
    }

    //删除指定节点
    public void removeByIndex(int index){
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        Node removed = prev.next;
        if (removed == null) {
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        prev.next = removed.next;
    }
}
