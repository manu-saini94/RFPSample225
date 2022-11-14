package com.bridgelabz;


// Data Types => Primitive and Non-Primitive
// Primitive => byte,short,int,long,float,double,char,boolean
// Non-Primitive => Array,class,enum,interface
public class DataTypes {

    // Variable => It is named memory location
    // It is a container which can be used for storing data

    public static void main(String[] args) {

        // Non-primitive

        DataTypes ref1 = new DataTypes();
        // new DataTypes(); is an object of DataTypes class
        // ref1 => reference pointing or holding an object


        // Some memory will be allocated to the variable 'b' and it will be initialized with value 2
        byte b = 2;  // byte , variable name , 2 is the value   , 1 byte , -128 to 127
        short s = 3; // 2 byte //
        int i = 4; // 4 byte   //
        long l = 5; // 8 byte  //

        long l3 = i;
        // byte,short,int,long => for integer data => default value => 0

//        byte d = i;
        long x = -2147483649L;

        // There is no requirement of type casting when we are storing lower data type variable into higher data type variable.
        // Whenever we are trying to store a higher data type variable to a lower data type variable , typecasting is mandatory
        // If the value taken in higher data type variable falls in the range of lower data type variable, there will not be any data loss
        // If the value taken in higher data type variable does not fall in the range of lower data type variable, there will be data loss

        int v = (int)x;
        System.out.println(v);

        float f = 3.5F;
        double d = 6.4;

        double d3 = f;

        // float,double => for fractional values => default value => 0.0F

        char ch = 'T'; // default value => '\u0000'

        char c = '\u0000';

        System.out.println(c);

        boolean flag = true; // default value => false

        System.out.println(flag);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(ch);

       // byte	1 byte	Stores whole numbers from -128 to 127
       // short	2 bytes	Stores whole numbers from -32,768 to 32,767
       // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
       // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
       // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
       // boolean 1 bit	Stores true or false values
       // char 2 bytes	Stores a single character/letter or ASCII values

    }

}
