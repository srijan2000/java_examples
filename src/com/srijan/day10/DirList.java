package com.srijan.day10;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File file = null;
        String[] paths = null;

        file = new File("./src/com/srijan/day1");
        paths = file.list();

        for(String path : paths){
            System.out.println(path);
        }

    }
}
