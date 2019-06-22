package com.srijan.day3;


import java.util.ArrayList;

class Student2{

    private String name;
    private int rollNumber;

    Student2(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }
}

public class StudentsTestDrive2 {

    public static void main(String[] args) {

        ArrayList<Student2> list = new ArrayList<>();

        Student2 s = new Student2("Srijan", 123);
        list.add(s);
        s = new Student2("Vamsi", 9898);
        list.add(s);

        for( Student2 st : list){
            System.out.println(st.getName() + ": " + st.getRollNumber());
        }
    }
}
