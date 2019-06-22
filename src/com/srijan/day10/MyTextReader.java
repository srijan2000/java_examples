package com.srijan.day10;

import java.io.*;

public class MyTextReader {

    public static void main(String[] args) {
        File file = new File("./src/com/srijan/day10/DirList2.java");

        if(!file.exists()){
            System.out.println("File is not existed...");
            System.exit(0);
        }

        BufferedReader br = null;
        Reader reader = null;
        try{
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
