package com.company.TaskDay5;

import java.util.SortedMap;

public class Test4 {
    public static void main(String[] args) {
        int a = -85;
        int b = 26;
//        System.out.println(Math.max(a,b));
       int max = a >= b ? a : b;
        System.out.println(max);
//        System.out.println(Math.abs(a));
        int abs = a > 0 ? a : (-a);
        System.out.println(abs);
    }
}
