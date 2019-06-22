package com.srijan.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NaturalSort {

    static String[] names = {"Srijan", "Venkatram", "Vinny", "Anitha", "Tinku", "Chintu"};

    public static void main(String[] args) {
        List<String> list = Arrays.asList(names);

        Collections.sort(list);

        for(String name: names) {
            System.out.println(name);
        }
    }
}
