package com.srijan.day2;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    private  int count;

    Person(){

    }

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("FirstName: " + this.firstName + " LastName: " + this.lastName + " age: "+ this.age);
    }

    public int getInstances(){
        return count;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.age;
    }

    public static void main(String[] args) {
        Person p = new Person( "Srijan", "Veerareddy", 19);
        System.out.println(p);

        Person p2 = new Person( "Venkatram", "Veerareddy", 54);
        System.out.println(p2);

        System.out.println("Number of instances " + p2.getInstances());
    }
}
