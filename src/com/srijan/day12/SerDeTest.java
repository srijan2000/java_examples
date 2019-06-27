package com.srijan.day12;

import java.io.*;

public class SerDeTest {

    public static void main(String[] args) {
        Person p1 = new Person("Srijan", "Veerareddy",19);
        Person p2 = new Person("Venkat", "Ram",59);

        Person[] pa = new Person[2];
        pa[0] = p1;
        pa[1] = p2;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"));
            out.writeObject(pa);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
            Person[] persons = (Person[])in.readObject();

            for(Person p : persons) {
                System.out.println(p.getFirstName() + ", " + p.getLastName() + ", " + p.getAge());
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

    }

}


class Person implements Serializable{

    private String firstName;
    private String lastName;
    private int age;

    public Person(){}

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

}



