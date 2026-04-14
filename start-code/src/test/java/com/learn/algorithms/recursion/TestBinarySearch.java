package com.learn.algorithms.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.learn.algorithms.recursion.BinarySearch.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {

    @Test
    @DisplayName("测试二分查找")
    public void testBinarySearch() {
        int[] arr = {3,5,7,12,15,18,21};
        assertEquals(0,search(arr,3));
        assertEquals(1,search(arr,5));
        assertEquals(2,search(arr,7));
        assertEquals(3,search(arr,12));
        assertEquals(4,search(arr,15));
        assertEquals(5,search(arr,18));
        assertEquals(6,search(arr,21));

        assertEquals(-1,search(arr,2));
        assertEquals(-1,search(arr,8));
        assertEquals(-1,search(arr,16));
    }
}
