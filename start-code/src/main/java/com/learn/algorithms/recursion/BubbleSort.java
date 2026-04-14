package com.learn.algorithms.recursion;

public class BubbleSort {

    public static void sort(int[] arr) {
//        bubbleSort(arr,arr.length -1 );
        bubbleSort2(arr,arr.length -1 );
    }

    private static void bubbleSort(int[] arr,int j) {
        if (j == 0){
            return;
        }
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,j-1);
    }

    //控制右边界
    public static void bubbleSort2(int[] arr,int j) {
        if (j == 0){
            return;
        }
        int end = 0;
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                end = i;
            }
        }
        bubbleSort2(arr,end);
    }
}
