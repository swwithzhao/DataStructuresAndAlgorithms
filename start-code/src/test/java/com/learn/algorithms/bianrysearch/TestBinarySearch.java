package com.learn.algorithms.bianrysearch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.learn.algorithms.bianrysearch.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {

    @Test
    @DisplayName("二分查找基础版")
    public void testBinarySearchBasic(){
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchBasic(a, 7));
        assertEquals(1, binarySearchBasic(a, 13));
        assertEquals(2, binarySearchBasic(a, 21));
        assertEquals(3, binarySearchBasic(a, 30));
        assertEquals(4, binarySearchBasic(a, 38));
        assertEquals(5, binarySearchBasic(a, 44));
        assertEquals(6, binarySearchBasic(a, 52));
        assertEquals(7, binarySearchBasic(a, 53));

        assertEquals(-1, binarySearchBasic(a, 0));
        assertEquals(-1, binarySearchBasic(a, 15));
        assertEquals(-1, binarySearchBasic(a, 60));
    }

    @Test
    @DisplayName("二分查找改动版")
    public void testBinarySearchAlternative(){
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchAlternative(a, 7));
        assertEquals(1, binarySearchAlternative(a, 13));
        assertEquals(2, binarySearchAlternative(a, 21));
        assertEquals(3, binarySearchAlternative(a, 30));
        assertEquals(4, binarySearchAlternative(a, 38));
        assertEquals(5, binarySearchAlternative(a, 44));
        assertEquals(6, binarySearchAlternative(a, 52));
        assertEquals(7, binarySearchAlternative(a, 53));

        assertEquals(-1, binarySearchAlternative(a, 0));
        assertEquals(-1, binarySearchAlternative(a, 15));
        assertEquals(-1, binarySearchAlternative(a, 60));
    }

    @Test
    @DisplayName("二分查找平衡版")
    public void testBinarySearchBalance(){
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchAlternative(a, 7));
        assertEquals(1, binarySearchAlternative(a, 13));
        assertEquals(2, binarySearchAlternative(a, 21));
        assertEquals(3, binarySearchAlternative(a, 30));
        assertEquals(4, binarySearchAlternative(a, 38));
        assertEquals(5, binarySearchAlternative(a, 44));
        assertEquals(6, binarySearchAlternative(a, 52));
        assertEquals(7, binarySearchAlternative(a, 53));

        assertEquals(-1, binarySearchAlternative(a, 0));
        assertEquals(-1, binarySearchAlternative(a, 15));
        assertEquals(-1, binarySearchAlternative(a, 60));
    }

    @Test
    @DisplayName("测试 binarySearchLeftmost")
    public void testBinarySearchLeftmost1() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchLeftMost1(a, 1));
        assertEquals(1, binarySearchLeftMost1(a, 2));
        assertEquals(2, binarySearchLeftMost1(a, 4));
        assertEquals(5, binarySearchLeftMost1(a, 5));
        assertEquals(6, binarySearchLeftMost1(a, 6));
        assertEquals(7, binarySearchLeftMost1(a, 7));

        assertEquals(-1, binarySearchLeftMost1(a, 0));
        assertEquals(-1, binarySearchLeftMost1(a, 3));
        assertEquals(-1, binarySearchLeftMost1(a, 8));
    }

    @Test
    @DisplayName("测试 binarySearchRightmost 返回 -1")
    public void testBinarySearchRightmost1() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost1(a, 1));
        assertEquals(1, binarySearchRightMost1(a, 2));
        assertEquals(4, binarySearchRightMost1(a, 4));
        assertEquals(5, binarySearchRightMost1(a, 5));
        assertEquals(6, binarySearchRightMost1(a, 6));
        assertEquals(7, binarySearchRightMost1(a, 7));

        assertEquals(-1, binarySearchRightMost1(a, 0));
        assertEquals(-1, binarySearchRightMost1(a, 3));
        assertEquals(-1, binarySearchRightMost1(a, 8));
    }
    @Test
    @DisplayName("测试 binarySearchLeftmost2")
    public void testBinarySearchLeftmost2() {
        int[] a = {1, 2, 4, 4, 4, 7, 8};
        assertEquals(0, binarySearchLeftMost2(a, 1));
        assertEquals(1, binarySearchLeftMost2(a, 2));
        assertEquals(2, binarySearchLeftMost2(a, 4));
        assertEquals(5, binarySearchLeftMost2(a, 7));
        assertEquals(6, binarySearchLeftMost2(a, 8));

        assertEquals(0, binarySearchLeftMost2(a, 0));
        assertEquals(2, binarySearchLeftMost2(a, 3));
        assertEquals(5, binarySearchLeftMost2(a, 5));
        assertEquals(7, binarySearchLeftMost2(a, 9));
    }

    @Test
    @DisplayName("测试 binarySearchRightmost 返回 i-1")
    public void testBinarySearchRightMost2() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost2(a, 1));
        assertEquals(1, binarySearchRightMost2(a, 2));
        assertEquals(4, binarySearchRightMost2(a, 4));
        assertEquals(5, binarySearchRightMost2(a, 5));
        assertEquals(6, binarySearchRightMost2(a, 6));
        assertEquals(7, binarySearchRightMost2(a, 7));

        assertEquals(0, binarySearchRightMost2(a, 0) + 1);
        assertEquals(2, binarySearchRightMost2(a, 3) + 1);
        assertEquals(8, binarySearchRightMost2(a, 8) + 1);
    }
}
