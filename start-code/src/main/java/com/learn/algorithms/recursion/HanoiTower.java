package com.learn.algorithms.recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * 汉诺塔问题
 */
public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n) {
        for(int i= n;i>0;i--){
            a.add(i);
        }
    }

    private static void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("===============================");
    }

    static void hanoiTower(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c,int n) {
        if (n==0){
            return;
        }
        hanoiTower(a,c,b,n-1);
        c.addLast(a.removeLast());
        print();
        hanoiTower(b,a,c,n-1);

    }

    public static void main(String[] args) {
        init(30);
        print();
        long s = System.currentTimeMillis();
        hanoiTower(a,b,c,a.size());
        System.out.println("执行 "+ (System.currentTimeMillis()-s)+"ms");
    }
}
