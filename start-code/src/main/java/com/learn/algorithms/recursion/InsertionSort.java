package com.learn.algorithms.recursion;

public class InsertionSort {

    public static void sort(int[] arr) {
        insertion(arr, 1);
    }

    private static void insertion(int[] arr, int low) {
        if (low == arr.length) {
            return;
        }
        int temp = arr[low];
        int j = low - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        if (j + 1 != low) {
            arr[j + 1] = temp;
        }
        insertion(arr, low + 1);
    }
}
