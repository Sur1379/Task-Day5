package com.company.TaskDay5;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Letter");
        String inputStr = scanner.next();
        if ((inputStr.charAt(0) < 'A' || inputStr.charAt(0) > 'Z') &&
                ((inputStr.charAt(0) < 'a' || inputStr.charAt(0) > 'z'))) {
            System.out.println("Incorrect symbol");
        } else {
            switch (inputStr) {
                case "A":
                    System.out.println("A is a vowel");
                    break;
                case "E":
                    System.out.println("E is a vowel");
                    break;
                case "I":
                    System.out.println("I is a vowel");
                    break;
                case "U":
                    System.out.println("U is a vowel");
                    break;
                case "O":
                    System.out.println("O is a vowel");
                    break;
                case "a":
                    System.out.println("a is a vowel");
                    break;
                case "e":
                    System.out.println("e is a vowel");
                    break;
                case "i":
                    System.out.println("i is a vowel");
                    break;
                case "u":
                    System.out.println("u is a vowel");
                    break;
                case "o":
                    System.out.println("o is a vowel");
                    break;
                default:
                    System.out.println(inputStr + " letter is a consonant");
            }
        }
    }
}