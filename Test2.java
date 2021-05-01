package com.company.TaskDay5;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("values are equal - " +(s1 == s2));
        System.out.println("strings are equal - " +(s1.equals(s2)));
    }
}
