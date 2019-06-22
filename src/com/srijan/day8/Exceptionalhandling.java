package com.srijan.day8;

public class Exceptionalhandling {
    public static void main(String args[]){
        int p,q;
        try {
            q=0;
            p=17/q;
            System.out.println("This line will never be printed");
        }
        catch (ArithmeticException ae){
            System.out.println("Division by zero");
        }
        System.out.println("After executing catch statement");
    }
}
