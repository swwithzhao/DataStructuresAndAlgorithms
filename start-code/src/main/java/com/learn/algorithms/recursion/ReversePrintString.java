package com.learn.algorithms.recursion;

public class ReversePrintString {

    public static void reversePrintString(String str,int n) {
        if (n == str.length()) {
            return;
        }
        reversePrintString(str, n + 1);
        System.out.println(str.charAt(n));
    }


    public static void main(String[] args) {
        reversePrintString("abcdef",0);
    }
}
