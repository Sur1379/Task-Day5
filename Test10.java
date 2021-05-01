package com.company.TaskDay5;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int inpuNum = scanner.nextInt();
        switch (inpuNum % 2 == 0 ? 1 : 2){
            case 1:
                System.out.println("Number is even");
                break;
            case 2:
                System.out.println("Number is odd");
        }
    }
}
