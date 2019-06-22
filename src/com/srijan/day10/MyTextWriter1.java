package com.srijan.day10;

import java.io.*;

public class MyTextWriter1 {

    public static void main(String[] args) {
        File file = new File("./mytest.txt");

        BufferedWriter bw = null;
        Writer writer = null;
        try{
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);

            bw.write("This is my test information, which is given by srijan.");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                writer.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}