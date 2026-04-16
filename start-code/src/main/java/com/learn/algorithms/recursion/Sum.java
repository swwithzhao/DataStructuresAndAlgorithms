package com.learn.algorithms.recursion;

public class Sum {

    public static long sum(long n) {
        if (n == 1){
            return 1;
        }
        return sum(n - 1)+n;
    }

    public static void main(String[] args) {
        System.out.println(sum(15000) );
//        int num = 0;
//        for (int i = 0; i < 15000; i++) {
//            num += i;
//        }
//        System.out.println(num);
    }

}
