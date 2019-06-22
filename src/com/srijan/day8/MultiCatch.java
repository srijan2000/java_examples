package com.srijan.day8;

public class MultiCatch {
    public static void main(String args []){
        int x = 100,y=9,z;
        int a[] ={10,20,30,40,50};
        try{
            System.out.println("Division :"+ x/y);
            System.out.println(a[9]);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero error :"+ e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
