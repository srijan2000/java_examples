package com.srijan.day8;

public class JustTryCatch {
    public static void main(String [] args){
        int i=7;
        int j = 0;
        try{
            System.out.println(i/j);
        }
        catch (ArithmeticException e){
            System.out.println("Arthmetic Exception Divide by zero error caught"+ e);
        }
    }
}
