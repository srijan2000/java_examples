package com.srijan.day6;

import java.util.ArrayList;
import java.util.List;

public class MixedBag {

    public static void main(String[] args){

        List list = new ArrayList();

        list.add("Srijan");
        list.add(1234);

        for(int i = 0; i < list.size(); i++){
            String name = (String)list.get(i);
            System.out.println(name);
        }

    }
}
