package com.bridgelabz;

import java.util.Scanner;

public class Arrays {

    // Array => A container that stores multiple elements of same datatype.

    public static void main(String[] args) {
        for (String x : args) {
            System.out.println(x);
        }
        System.out.println();
        int[] arr1 = new int[10];
        arr1[4] = 34;
        arr1[9] = 23;
        arr1[0] = 33;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter String values");
//        String[] str = new String[5];
//        for (int i = 0; i < str.length; i++) {
//            System.out.println("Enter " + i + " string value");
//            str[i] = scanner.next();
//        }
//
//        System.out.println();
//        for (String x : str) {
//            System.out.println(x);
//        }

        Student[] studentArray = new Student[5];
        Student student1 = new Student();
        Student student2 = new Student();

        studentArray[4] = student2;
        studentArray[3] = student1;

        for (Student x : studentArray) {
            System.out.println(x);
        }

        int[] arr2 = {12, 23, 31, 43, 58, 61, 74};

        for (int x : arr2) {
            System.out.println(x);
        }

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[][] arr3 = new int[3][6];
        // 0 , 1 ,2     // 0 , 1 , 2 , 3 , 4 , 5
        // 00 , 01 , 02 , 10 , 11 ,12 , 20 , 21 ,22

//        arr3[0][0] = 23;
//        arr3[0][1] = 45;
//        arr3[2][1] = 35;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i * j + i + j;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
        System.out.println();

        int[][] arr4 = {{1,2,3},{3,5,6},{1,5,8}};

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
        

    }
}
