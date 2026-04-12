package com.learn.datastructures.singlelinkedlist;

import com.learn.datastructures.linkedlist.singleListSentinel.SingleLinkedListSentinel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSingleLinkedListSentinel {
    @Test
    @DisplayName("测试 addFirst")
    public void testSingleLinkedList() {
        SingleLinkedListSentinel list = setLinkedListFirst();
        System.out.println("遍历方法1while循环");
//        assertIterableEquals(List.of(4, 3, 2, 1), list);
        list.loopWhile(System.out::println);
        System.out.println("遍历方法2for循环");
        list.loopFor(System.out::println);
        System.out.println("遍历方法3迭代器");
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    @Test
    @DisplayName("测试最后位置插入")
    public void testAddLast() {
        SingleLinkedListSentinel list = setLinkedListLast();
        assertIterableEquals(List.of(1, 2, 3, 4), list);
    }

    private static SingleLinkedListSentinel setLinkedListFirst() {
        SingleLinkedListSentinel list = new SingleLinkedListSentinel();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        return list;
    }

    private static SingleLinkedListSentinel setLinkedListLast() {
        SingleLinkedListSentinel list = new SingleLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    @DisplayName("测试 get")
    public void testGetValue() {
        SingleLinkedListSentinel list = setLinkedListLast();

        assertEquals(3, list.getValue(2));
        assertThrows(IllegalArgumentException.class, () -> list.getValue(10));
    }

    @Test
    @DisplayName("测试指定位置插入")
    public void testInsertValue() {
        SingleLinkedListSentinel list = setLinkedListLast();
        list.insert(0, 5);
        assertIterableEquals(List.of(5, 1, 2, 3, 4), list);

        list = setLinkedListLast();
        list.insert(2, 5);
        assertIterableEquals(List.of(1, 2, 5, 3, 4), list);

        list = setLinkedListLast();
        list.insert(4, 5);
        assertIterableEquals(List.of(1, 2, 3, 4, 5), list);

        assertThrows(IllegalArgumentException.class,
                () -> setLinkedListLast().insert(5, 5));

        list = setLinkedListLast();
        list.addFirst(5);
        assertIterableEquals(List.of(5, 1, 2, 3, 4), list);

        SingleLinkedListSentinel list2 = new SingleLinkedListSentinel();
        list2.addFirst(1);
        assertIterableEquals(List.of(1), list2);
    }

    @Test
    @DisplayName("首位元素删除")
    public void testRemoveFirst() {
        SingleLinkedListSentinel list = setLinkedListLast();
        list.removeFirst();
        assertIterableEquals(List.of(2, 3, 4), list);
        list.removeFirst();
        assertIterableEquals(List.of(3, 4), list);
        list.removeFirst();
        assertIterableEquals(List.of(4), list);
        list.removeFirst();
        assertIterableEquals(List.of(), list);
        assertThrows(IllegalArgumentException.class, list::removeFirst);
    }

    @Test
    @DisplayName("指定位置元素删除")
    public void testRemoveByIndex() {
        SingleLinkedListSentinel list1 = setLinkedListLast();
        list1.removeByIndex(2);
        assertIterableEquals(List.of(1, 2, 4), list1);

        SingleLinkedListSentinel list2 = setLinkedListLast();
        list2.removeByIndex(0);
        assertIterableEquals(List.of(2, 3, 4), list2);

        SingleLinkedListSentinel list3 = setLinkedListLast();
        assertThrows(IllegalArgumentException.class, () -> list3.removeByIndex(5));

        SingleLinkedListSentinel list4 = setLinkedListLast();
        assertThrows(IllegalArgumentException.class, () -> list4.removeByIndex(4));
    }
}
