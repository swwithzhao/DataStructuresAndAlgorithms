package com.learn.algorithms.bianrysearch;

public class BinarySearch {

    /**
     * 二分查找基础版
     *
     * @param a
     * @param target
     * @return
     */
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

    /**
     * 二分查找改动版
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchAlternative(int[] a, int target) {
        int left=0,right=a.length;
        while (left<right){
            int mid=(left+right)>>>1;
            if (target>a[mid]){
                left=mid+1;
            }else if (target<a[mid]){
                right=mid;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
