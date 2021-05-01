package com.company.TaskDay5;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        String day1 = new String("Monday");
        String day2 = new String("Tuesday");
        String day3 = new String("Wednesday");
        String day4 = new String("Thursday");
        String day5 = new String("Friday");
        String day6 = new String("Saturday");
        String day7 = new String("Sunday");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of day");
        int inputDay = scanner.nextInt();
       String iDayString = String.valueOf(inputDay);
        switch (iDayString){
            case "1":
                System.out.println(day1);
                break;
            case "2":
                System.out.println(day2);
                break;
            case "3":
                System.out.println(day3);
                break;
            case "4":
                System.out.println(day4);
                break;
            case "5":
                System.out.println(day5);
            case "6":
                System.out.println(day6);
                break;
            case "7":
                System.out.println(day7);
                break;
            default:
                System.out.println("ERROR");
        }

       }
    }

