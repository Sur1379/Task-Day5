package com.company.TaskDay5;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz score - ");
        int quiz = scanner.nextInt();
        System.out.print("Mid-term score - ");
        int mid = scanner.nextInt();
        System.out.print("Final score score - ");
        int finalScore = scanner.nextInt();
       int average = (quiz + mid + finalScore)/3;
        if (average >= 80 ){
            System.out.println("Your grade is A");
        }
        else if (average < 80 && average >= 60){
            System.out.println("Your grade is B");
        }
        else if (average < 60 && average >= 40){
            System.out.println("Your grade is C");
        }
        else {
            System.out.println("Your grade is F");
        }
    }
}
