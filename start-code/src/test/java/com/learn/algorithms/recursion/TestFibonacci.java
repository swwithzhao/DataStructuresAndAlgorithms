package com.learn.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static com.learn.algorithms.recursion.Fibonacci.calcFibonacciWithCache;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 斐波那契数列计算
 */
public class TestFibonacci {
    @Test
    public void testFibonacci() {
        assertEquals(1, calcFibonacciWithCache(2));
        assertEquals(2, calcFibonacciWithCache(3));
        assertEquals(3, calcFibonacciWithCache(4));
        assertEquals(5, calcFibonacciWithCache(5));
        assertEquals(8, calcFibonacciWithCache(6));
        assertEquals(13, calcFibonacciWithCache(7));
        assertEquals(21, calcFibonacciWithCache(8));
        assertEquals(34, calcFibonacciWithCache(9));
        assertEquals(55, calcFibonacciWithCache(10));
        assertEquals(89, calcFibonacciWithCache(11));
        assertEquals(144, calcFibonacciWithCache(12));
        assertEquals(233, calcFibonacciWithCache(13));
    }
}
