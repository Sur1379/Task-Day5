package com.company.TaskDay5;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("input second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /)");
        String opt = scanner.next();
        int a = num1 * num2;
        double b = num1 / num2;
        int c = num1 + num2;
        int d = num1 - num2;
        switch (opt.equals("*") ? 1 : opt.equals("/") ? 2 : opt.equals("+") ? 3 : 4) {
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
                System.out.println(d);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
