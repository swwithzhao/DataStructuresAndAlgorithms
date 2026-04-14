package com.learn.datastructures.linkedlist;

import java.util.Iterator;

/**
 * 双向链表（带哨兵）
 */
public class DoublyLinkedListSentinel implements Iterable<Integer> {

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(Node prev, int data,Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, Integer.MIN_VALUE, null);
        tail = new Node(null, Integer.MAX_VALUE, null);
        head.next = tail;
        tail.prev = head;
    }

    Node findNode(int index){
        int i = -1;
        Node current = head;
        while (current != tail){
            if (i == index){
                return current;
            }
            i++;
            current = current.next;
        }
        return null;
    }

    public void insertFirst(int data) {
        insertNode(0, data);
    }

    public void insertLast(int data) {
        Node prev = tail.prev;
        Node node = new Node(prev, data, tail);
        tail.prev = node;
        prev.next = node;
    }

    public void insertNode(int index,int data){
        Node prev = findNode(index - 1);
        if (prev ==null){
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        Node next = prev.next;
        Node node = new Node(prev, data, next);
        prev.next = node;
        next.prev = node;
    }

    public void removeNode(int index){
        Node prev = findNode(index - 1);
        if (prev == null){
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
        Node removed = prev.next;
        if (removed == tail){
            throw new IllegalArgumentException("Index [" + index + "] out of bounds");
        }
       Node next = removed.next;
        prev.next = next;
        next.prev = prev;
    }

    public void removeFirst(){
        removeNode(0);
    }

    public void removeLast(){
        Node removed = tail.prev;
        if (removed == head){
            throw new IllegalArgumentException("Index [" + removed + "] out of bounds");
        }
        Node prev = removed.prev;
        prev.next = tail;
        tail.prev = prev;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node current = head.next;
            @Override
            public boolean hasNext() {
                return current != tail;
            }

            @Override
            public Integer next() {
                Integer result = current.data;
                current = current.next;
                return result;
            }
        };
    }

}
