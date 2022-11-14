package com.bridgelabz;

public class Repetetive {

    // Loops => for,while, do-while
    public static void main(String[] args) {

        //post-increment, pre-increment, post-decrement, pre-decrement operators =>  i++ , ++i , i-- , --i
        int x = 0;
        int res1 = x++ + ++x + x++ + x++ + ++x + x++; // 0 + 2 + 2 + 3 + 5 + 5  = 17
        System.out.println(x); // 6
        System.out.println(res1); //17

        int v = 1;
        int res2 = v-- + v++ - --v + v++ + ++v + v-- + v-- + --v + ++v + v--; // 1 + 0 - 0 + 0 + 2 + 2 + 1 + (-1) + 0 + 0 = 5
        System.out.println(v); // -1
        System.out.println(res2); // 5

        int z = 2;
        int res3 = --z - --z + ++z + z-- + z++ + --z - ++z + z-- + z + v++; // 1 - 0 + 1 + 1 + 0 + 0 - 1 + 1 + 0 = 2
        System.out.println(z); // 2 // 0 // 0 // 0 // 0 // 0 // 0 // 0 // 3 // -2 // 2 // -1 // 2 // 0 // 2 // 0 // 0
        System.out.println(res3); // 5 // 1 //-1 // 3 // 3 // 4 // 3 // 3 // -2 // 1 // 9 // 1 // 6 // 4 // 6 // 3 // 3
        System.out.println(v); //0

        System.out.println("*************************************************");
        int u = 24;
        for (int i = 0; i < 10; ++i) {
            int w = 23;
            System.out.println(i);
//            System.out.println(w);
//            System.out.println(u);
        }
//        System.out.println(i);
//        System.out.println(u);
//        System.out.println(w);
        System.out.println("for loop ended");

        System.out.println("************************************************");
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }
        System.out.println("while loop ended");

        System.out.println("***********************************************");
        int m = 9;
        do {
            System.out.println(m);
            m++;
        } while (m < 10);

//        System.out.println("do-while loop ended");

    }
}
