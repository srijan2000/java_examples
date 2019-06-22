package com.srijan.day3;


class Student{

    private String name;
    private int rollNumber;

    Student(String name, int rollNumber){
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

public class StudentsTestDrive {

    public static void main(String[] args) {
        Student[] students = new Student[2];

        Student s = new Student("Srijan", 123);
        students[0] = s;
        s = new Student("Vamsi", 9898);
        students[1] = s;

        for( Student st : students){
            System.out.println(st.getName() + ": " + st.getRollNumber());
        }
    }
}
