package com.company.TaskDay5;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "a. Yerevan";
        String b = "b. Paris";
        String c = "c. London";
        String d = "d. Hong-Kong";
        System.out.println("........ is the capital of Great Britain \n Choose the right answer");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        String inputString = scanner.next();
        switch (inputString) {
            case "a":
                System.out.println("invalide choice");
                break;
            case "b":
                System.out.println("invalide choice");
                break;
            case "c":
                System.out.println(" Congrulation !!!!");
                break;
            case "d":
                System.out.println("invalide choice");
        }
    }
}
