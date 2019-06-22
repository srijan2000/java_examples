package com.srijan.day8;

public class Example{
    public static void main(String args[]){
        int x,y,z;
        try{
            x = 5;
            y = 0;
            z = x / y;
            System.out.println("The output for z cannot be executed.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Expression throws divide by 0 exceptions");
        }
    }
}