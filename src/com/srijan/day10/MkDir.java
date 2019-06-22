package com.srijan.day10;

import java.io.File;

public class MkDir {

    public static void main(String[] args) {
        String myDir = "./temp/sri/venkat/ram";

        File f = new File(myDir);
        f.mkdirs();
    }
}
