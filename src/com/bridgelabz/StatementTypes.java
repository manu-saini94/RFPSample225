package com.bridgelabz;

// Sequential,  selection and repetetive
public class StatementTypes {

    static void m1(){
        System.out.println("m1");
    }

    public static void main(String[] args) {
        int a = 15;
        System.out.println(a);
        System.out.println("this is main");
        m1();
        int sum = a + 23;
        System.out.println(sum);

        // if-else
        if(a == 11){
            int x = 45;
            System.out.println("if block "+a);
        }else{
//            System.out.println(x);
            System.out.println("else block " +a);
        }
//        System.out.println(x);


        // if-else-if

        if(a > 30){
            System.out.println("a is > than 30");
        }else if(a>=15 || a<=30) {
            System.out.println("a is >= 15 and a is <= 30");
        }else if(a>=10 || a<15){
            System.out.println("a is >= 10 and a is < 15");
        } else {
            System.out.println("a < 10");
        }

        System.out.println("main ending");



    }
}
