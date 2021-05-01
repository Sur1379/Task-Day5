package com.company.TaskDay5;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int inputNum = scanner.nextInt();
//        if (inputNum > 0){
//            System.out.println("positive");
//        }
//        else {
//            System.out.println("negative");
        if (inputNum > 0) {
            System.out.println("positive");
        } else if (inputNum == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("negative");
        }
    }
}


