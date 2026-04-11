package com.learn.algorithms.LinkedList.singlelinkedlist;

import org.junit.jupiter.api.Test;

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
}
