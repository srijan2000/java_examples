package com.srijan.day6;

import java.util.ArrayList;
import java.util.List;

public class GenericList01 {

    public static void main(String [] args){

        List <String>list = new ArrayList<>();

        list.add("Srijan");
        list.add("CSE");

        for (int i=0;i<list.size();i++){
            String name = list.get(i);
            System.out.println(name);
        }
        System.out.println("Another way...");

        for (String str: list){
            System.out.println(str);
        }
    }
}
