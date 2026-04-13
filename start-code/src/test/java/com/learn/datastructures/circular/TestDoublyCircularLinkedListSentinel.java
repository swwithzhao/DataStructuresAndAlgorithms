package com.learn.datastructures.circular;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDoublyCircularLinkedListSentinel {

    @Test
    public void testAddFirst(){
        DoublyCircularLinkedListSentinel list = new DoublyCircularLinkedListSentinel();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        assertIterableEquals(List.of(5,4,3,2,1),list);
    }

    @Test
    public void testAddLast(){
        DoublyCircularLinkedListSentinel list = new DoublyCircularLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        assertIterableEquals(List.of(1,2,3,4,5),list);
    }

    @Test
    public void testRemoveFirst(){
        DoublyCircularLinkedListSentinel list = getList();
        list.removeFirst();
        assertIterableEquals(List.of(2,3,4,5),list);
        list.removeFirst();
        assertIterableEquals(List.of(3,4,5),list);
        list.removeFirst();
        assertIterableEquals(List.of(4,5),list);
        list.removeFirst();
        assertIterableEquals(List.of(5),list);
        list.removeFirst();
        assertIterableEquals(List.of(),list);
        assertThrows(IllegalArgumentException.class, list::removeFirst);
    }

    @Test
    public void testRemoveLast(){
        DoublyCircularLinkedListSentinel list = getList();
        list.removeLast();
        assertIterableEquals(List.of(1,2,3,4),list);
        list.removeLast();
        assertIterableEquals(List.of(1,2,3),list);
        list.removeLast();
        assertIterableEquals(List.of(1,2),list);
        list.removeLast();
        assertIterableEquals(List.of(1),list);
        list.removeLast();
        assertIterableEquals(List.of(),list);
        assertThrows(IllegalArgumentException.class, list::removeLast);

    }

    @Test
    public void testRemoveByValue(){
        DoublyCircularLinkedListSentinel list = getList();
        list.removedByValue(2);
        assertIterableEquals(List.of(1,3,4,5),list);
        assertThrows(IllegalArgumentException.class,()->{list.removedByValue(6);});
        list.removedByValue(5);
        assertIterableEquals(List.of(1,3,4),list);
        list.removedByValue(3);
        assertIterableEquals(List.of(1,4),list);
        list.removedByValue(1);
        assertIterableEquals(List.of(4),list);
        list.removedByValue(4);
        assertIterableEquals(List.of(),list);
    }

    private DoublyCircularLinkedListSentinel getList(){
        DoublyCircularLinkedListSentinel list = new DoublyCircularLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        return list;
    }

}
