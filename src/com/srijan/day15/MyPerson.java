package com.srijan.day15;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyPerson {

    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    public MyPerson(String firstName, String lastName, String email, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public double getSalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        //createJson();
        createJsonArray();
    }

    private static void createJsonArray() {

        List<MyPerson> pList = new ArrayList();

        MyPerson p = new MyPerson("Srijan", "Veerareddy", "srijan.veerareddy@gmail.com", 9898989.99);
        pList.add(p);
        MyPerson p2 = new MyPerson("Sanju", "Sampson", "sanju@gmail.com", 55555.99);
        pList.add(p2);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new FileOutputStream("myperson2.json"), pList);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void createJson() {
        MyPerson p = new MyPerson("Srijan", "Veerareddy", "srijan.veerareddy@gmail.com", 9898989.99);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new FileOutputStream("myperson.json"), p);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
