package com.srijan.day8;

import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter denominator: ");
            int denominator = sc.nextInt();
            System.out.println("Enter numerator: ");
            int numerator = sc.nextInt();

            int divisor = denominator/numerator;
            System.out.println(divisor);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException...");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception...");
            e.printStackTrace();
        }
    }
}
