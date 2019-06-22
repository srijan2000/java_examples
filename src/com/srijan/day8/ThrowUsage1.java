package com.srijan.day8;

import java.io.IOException;

public class ThrowUsage1 {
    static void test() throws IOException{
        System.out.println("Inside test () throwing io exception ");
        throw new IOException("Io Exception");
    }
    public static void main(String args []){
        try {
            test();
        }
        catch (IOException e){
            System.out.println(" caught :"+ e);
        }
    }
}
