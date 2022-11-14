package com.bridgelabz;

public class Basics {

    // void means method will not return anything
    // method definition => how the method should behave , what code has to be executed
    static int sumOfTwoNumbers(int x,int y){
        long sum = x + y; // -2147483648
        return (int)sum;
    }

    static int productOfTwoNumbers(int num1,int num2) {
        int prod = num1 * num2;
        return prod;
    }

    public static void main(String[] args) {
        System.out.println("main starting");
        int s = sumOfTwoNumbers(-2147483644,-4);
        System.out.println(s);
        int result = s * 56;
        System.out.println(result);

        int s1 = sumOfTwoNumbers(23,14);
        System.out.println(s1);
        int result2 = s1%48;
        System.out.println(result2);

        int p = productOfTwoNumbers(4,9);
        System.out.println(p);
        System.out.println("Main ending");


    }


}
