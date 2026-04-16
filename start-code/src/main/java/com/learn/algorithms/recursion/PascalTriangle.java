package com.learn.algorithms.recursion;

/**
 * 杨辉三角
 */
public class PascalTriangle {

    static int calNum(int i, int j) {
        if (i == j || j == 0) {
            return 1;
        }
        return calNum(i - 1, j - 1) + calNum(i - 1, j);
    }

    static void printSpace(int n, int i) {
        int num = (n - 1 - i) * 2;
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }

    static void printTriangle(int num) {
        for (int i = 0; i < num; i++) {
            printSpace(num, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", calNum(i, j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        System.out.println(calNum(2,1));
//        printTriangle(8);
        printTriangle2(8);
    }

    //二维数组操作
    static void printTriangle1(int num) {
        int[][] triangle = new int[num][];
        for (int i = 0; i < num; i++) {
//            printSpace(num,i);
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", calNum2(triangle, i, j));
            }
            System.out.println();
        }
    }

    static int calNum2(int[][] triangle, int i, int j) {
        if (triangle[i][j] != 0) {
            return triangle[i][j];
        }
        if (i == j || j == 0) {
            return 1;
        }
        triangle[i][j] = calNum2(triangle, i - 1, j - 1) + calNum2(triangle, i - 1, j);
        return triangle[i][j];
    }

    //优化使用一维数组

    static void printTriangle2(int num) {
        int[] triangle = new int[num];
        for (int i = 0; i < num; i++) {
            calNum2(triangle, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", triangle[j]);
            }
            System.out.println();
        }
    }

    static void calNum2(int[] triangle, int i) {
        if (i == 0) {
            triangle[0] = 1;
            return;
        }
        for (int j = i; j > 0; j--) {
            triangle[j] = triangle[j - 1] + triangle[j];
        }
    }
}
