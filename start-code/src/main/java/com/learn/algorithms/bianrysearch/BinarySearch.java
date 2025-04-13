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
            if (target > a[mid]) {
                left = mid + 1;
            } else if (target < a[mid]) {
                right = mid - 1;
            } else {
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
        int left = 0, right = a.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target > a[mid]) {
                left = mid + 1;
            } else if (target < a[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找平衡版
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchBalance(int[] a, int target) {
        int left = 0, right = a.length;
        while (right - left > 1) {
            int mid = (left + right) >>> 1;
            if (a[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (a[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * 最左符合元素二分查找
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchLeftMost1(int[] a, int target) {
        int left = 0, right = a.length - 1;
        int leftResult = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (a[mid] < target) {
                left = mid + 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                leftResult = mid;
                right = mid - 1;
            }
        }
        return leftResult;
    }

    /**
     * 最右符合元素二分查找
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchRightMost1(int[] a, int target) {
        int left = 0, right = a.length - 1;
        int rightResult = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (a[mid] > target) {
                right = mid - 1;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                rightResult = mid;
                left = mid + 1;
            }
        }
        return rightResult;
    }


    /**
     * 最左符合元素二分查找2
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchLeftMost2(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (a[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 二分查找最右元素方法2
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchRightMost2(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (a[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
