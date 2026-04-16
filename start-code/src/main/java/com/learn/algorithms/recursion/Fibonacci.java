package com.learn.algorithms.recursion;

import java.util.Arrays;

/**
 * 斐波那契数列
 */
public class Fibonacci {

    public static int calcFibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int calcFibonacci = calcFibonacci(10);
        System.out.println(calcFibonacci);
    }

    public static int calcFibonacciWithCache(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        return calcFibonacciResult(n,cache);
    }

    public static int calcFibonacciResult(int n,int[] cache) {
        if (cache[n] != -1) {
            return cache[n];
        }

        cache[n] = calcFibonacciResult(n - 1, cache)+calcFibonacciResult(n - 2, cache);
        return cache[n];
    }
}
