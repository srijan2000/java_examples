package com.srijan.day8;
import java.util.Scanner;

public class ExceptionHandling01
    {
    public static void main(String[] args)
      {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        result = a / b;

        System.out.println("Result = " + result);
      }
    }

