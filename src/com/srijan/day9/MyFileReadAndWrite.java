package com.srijan.day9;

import java.io.*;

public class MyFileReadAndWrite {
    public static void main(String[] args) {
        File file = new File("./src/com/srijan/day1/StrArray.java");
        FileReader input = null;
        FileWriter writer = null;
        try {
            input = new FileReader(file);
            writer = new FileWriter("./str_array.txt");
            int ch;
            while((ch = input.read()) != -1){
                writer.write(ch);
            }
        }catch (FileNotFoundException fne){
            fne.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }finally {
            try {
                if(input != null) {
                    input.close();
                }
                if(writer != null) {
                    writer.close();
                }
            }catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
