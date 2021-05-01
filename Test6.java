package com.company.TaskDay5;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input different 3 numbers");
        System.out.println("input a");
        int a = scanner.nextInt();
        System.out.println("input b");
        int b = scanner.nextInt();
        System.out.println("input v");
        int c = scanner.nextInt();
        switch ((a > b && a > c) ? 1 : (b > a && b > c) ? 2 : (c > a && c > b) ? 3 : 4) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            case 4:
                System.out.println("error");
        }

    }
}
