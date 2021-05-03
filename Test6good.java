package TaskDay5;

import java.util.Scanner;

public class Test6good {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input different 3 numbers");
        System.out.println("input a");
        int a = scanner.nextInt();
        System.out.println("input b");
        int b = scanner.nextInt();
        System.out.println("input c");
        int c = scanner.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
    }
}
