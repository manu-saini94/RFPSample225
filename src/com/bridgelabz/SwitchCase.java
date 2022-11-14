package com.bridgelabz;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int x = 30;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string value ");
        String str = scan.next(); // str = "23432"
        System.out.println(str);
        System.out.println("Enter your choice : ");
        int ch = scan.nextInt();

//        int ch = 4;

        switch (ch) {
            case 1:
                int sum = x + 20;
                System.out.println("case 1");
                System.out.println("sum "+ sum);
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            default:
                System.out.println("default");
        }
    }
}
