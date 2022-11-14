package com.bridgelabz;

// Local , static and instance variables

// Local Variables => A variable declared inside a method or a block is called local variable.
// If we are not initializing local variable and we try to use it , we will get error.
// The scope of local variable will be within the method or block in which it is declared.

public class VariableTypes {

    static void m1() {
        int x = 10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 20; // declaration + initialization
        System.out.println(x);
    }

}
