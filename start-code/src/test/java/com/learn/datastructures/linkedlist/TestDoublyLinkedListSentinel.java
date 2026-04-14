package com.learn.datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDoublyLinkedListSentinel {

    @Test
    public void testInsertFirst(){
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.insertFirst(1);
        doublyLinkedListSentinel.insertFirst(2);
        doublyLinkedListSentinel.insertFirst(3);
        doublyLinkedListSentinel.insertFirst(4);
        doublyLinkedListSentinel.insertFirst(5);
        assertIterableEquals(List.of(5,4,3,2,1),doublyLinkedListSentinel);
    }

    private DoublyLinkedListSentinel getList(){
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        return list;
    }

    @Test
    public void testInsertLast(){
        DoublyLinkedListSentinel doublyLinkedListSentinel = getList();
        assertIterableEquals(List.of(1,2,3,4,5),doublyLinkedListSentinel);
    }

    @Test
    public void testInsert(){
        DoublyLinkedListSentinel list = getList();
        list.insertNode(2,6);
        assertIterableEquals(List.of(1,2,6,3,4,5),list);
        list.insertNode(6,7);
        assertIterableEquals(List.of(1,2,6,3,4,5,7),list);
        assertThrows(IllegalArgumentException.class, ()->{list.insertNode(9,9);});
    }

    @Test
    public void testRemoveFirst(){
        DoublyLinkedListSentinel doublyLinkedListSentinel = getList();
        doublyLinkedListSentinel.removeFirst();
        assertIterableEquals(List.of(2,3,4,5),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeFirst();
        assertIterableEquals(List.of(3,4,5),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeFirst();
        assertIterableEquals(List.of(4,5),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeFirst();
        assertIterableEquals(List.of(5),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeFirst();
        assertIterableEquals(List.of(),doublyLinkedListSentinel);
        assertThrows(IllegalArgumentException.class, doublyLinkedListSentinel::removeFirst);
    }

    @Test
    public void testRemoveLast(){
        DoublyLinkedListSentinel doublyLinkedListSentinel = getList();
        doublyLinkedListSentinel.removeLast();
        assertIterableEquals(List.of(1,2,3,4),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeLast();
        assertIterableEquals(List.of(1,2,3),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeLast();
        assertIterableEquals(List.of(1,2),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeLast();
        assertIterableEquals(List.of(1),doublyLinkedListSentinel);
        doublyLinkedListSentinel.removeLast();
        assertIterableEquals(List.of(),doublyLinkedListSentinel);
        assertThrows(IllegalArgumentException.class, doublyLinkedListSentinel::removeLast);
    }

    @Test
    public void testRemoveNode(){
        DoublyLinkedListSentinel list = getList();
        list.removeNode(2);
        assertIterableEquals(List.of(1,2,4,5),list);

        assertThrows(IllegalArgumentException.class, ()->{list.removeNode(10);});

        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        assertThrows(IllegalArgumentException.class, ()->{doublyLinkedListSentinel.removeNode(0);});
    }
}
