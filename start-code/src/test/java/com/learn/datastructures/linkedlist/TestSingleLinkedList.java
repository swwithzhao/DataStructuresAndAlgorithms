package com.learn.datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleLinkedList {

    @Test
    public void testSingleLinkedList() {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        System.out.println("遍历方法1while循环");
        list.loopWhile(System.out::println);
        System.out.println("遍历方法2for循环");
        list.loopFor(System.out::println);
        System.out.println("遍历方法3迭代器");
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    @Test
    public void testAddLast() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5), list);
    }

    @Test
    public void testGetParam() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list.get(4));
    }

    @Test
    public void testInsert() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.insert(0, 6);
        list.forEach(System.out::println);
    }

    @Test
    public void testRemove() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

//        list.removeFirst();
        list.removeByIndex(4);
        list.forEach(System.out::println);


    }
}
