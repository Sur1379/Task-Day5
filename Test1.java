package com.company.TaskDay5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input text 1 ");
        String someString1 = scanner.next();
        System.out.println("input text 2 ");
        String someString2 = scanner.next();
        System.out.println(" values are equal " + (someString1 == someString2));
        System.out.println(" textes are equal " + someString1.equals(someString2));

    }
}
