package com.srijan.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommandLineReader {

    public static void main(String[] args){
        System.out.println("Enter your size: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            int size = Integer.parseInt(str);

            System.out.println("Your entered : " + size);
            int counter = 0;
            while(counter < size){
                System.out.println("Enter your marsk: ");
                str = br.readLine();
                int marks = Integer.parseInt(str);
                System.out.println("Marks : " + marks);
                counter++;
            }
        }catch (IOException e){

        }
    }
}
