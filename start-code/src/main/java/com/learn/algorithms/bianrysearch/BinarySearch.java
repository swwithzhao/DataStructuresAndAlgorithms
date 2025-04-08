package com.learn.algorithms.bianrysearch;

public class BinarySearch {

    public static int binarySearchBasic(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target>a[mid]){
                left=mid+1;
            }else if (target<a[mid]){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
