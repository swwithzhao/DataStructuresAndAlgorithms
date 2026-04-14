package com.learn.datastructures.circular;

import java.util.Iterator;

public class DoublyCircularLinkedListSentinel  implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;
            @Override
            public boolean hasNext() {
                return  p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p=p.next;
                return value;
            }
        };
    }

    public static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public final Node sentinel = new Node(null,-1,null);

    //初始化
    public DoublyCircularLinkedListSentinel() {
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    //添加第一个
    public void addFirst(int value) {
        Node a = sentinel;
        Node b = sentinel.next;
        Node newNode = new Node(a,value,b);
        a.next = newNode;
        b.prev = newNode;
    }

    //添加最后一个
    public void addLast(int value) {
        Node a = sentinel.prev;
        Node b = sentinel;
        Node newNode = new Node(a,value,b);
        a.next = newNode;
        b.prev = newNode;
    }

    //删除第一个
    public void  removeFirst() {
        Node removed = sentinel.next;
        if (removed == sentinel) {
            throw new IllegalArgumentException("The sentinel is empty");
        }
        Node a = sentinel;
        Node b = removed.next;
        a.next = b;
        b.prev = a;
    }

    //删除最后一个
    public void  removeLast() {
        Node removed = sentinel.prev;
        if (removed == sentinel) {
            throw new IllegalArgumentException("The sentinel is empty");
        }
        Node a = sentinel;
        Node b = removed.prev;
        b.next = a;
        a.prev = b;
    }


    //根据数值删除
    public void removedByValue(int value) {
        Node removed = getRemoveNode(value);
        if ( removed == null){
            throw new IllegalArgumentException("The value is not found");
        }
        Node prev = removed.prev;
        Node next = removed.next;
        prev.next = next;
        next.prev = prev;
    }

    private Node getRemoveNode(int value) {
        Node node = sentinel.next;
        while (node != sentinel) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

}
