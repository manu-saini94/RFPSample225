package com.bridgelabz;

// Java Terminology
// JDK => Java Development Kit => JRE + Compilers + Javadocs + java debugger
// JRE => Java Runtime Environment => JVM
// JVM => Java Virtual Machine =>

// Whenever we run a program , .java file(source code) is given to the compiler.
// Compiler will convert the .java file(source code) into .class file(byte code).
// .class file is loaded by class loader into the JVM memory(method area).
// JVM finally converts the byte code into machine readable code. So , JVM works as an interpreter
// This machine readable code is finally executed by JVM and we get the output.
// Inside JVM , there is 'main thread' which is responsible for calling and executing the 'main method'.
// main thread will have one PC Register.
// PC Register contains the instructions of code which has been executed as well as which is going to be executed.

public class HelloWorld {


    public static void main(String[] args) {

        HelloWorld obj1 = new HelloWorld();
        HelloWorld obj2 = new HelloWorld();

        System.out.println("Hello World");
    }

}
