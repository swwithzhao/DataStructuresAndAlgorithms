package com.learn.algorithms.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestInsertionSort {

    @Test
    @DisplayName("测试插入排序")
    public void insertionSort() {
        int[] expected = {1,2,3,4,5};
        int[] a1 ={5,4,3,2,1};
        InsertionSort.sort(a1);
        assertArrayEquals(expected,a1);

        int[] a2 ={3,5,4,1,2};
        InsertionSort.sort(a2);
        assertArrayEquals(expected,a2);

        int[] a3 ={1,2,3,4,5};
        InsertionSort.sort(a3);
        assertArrayEquals(expected,a3);
    }
}
