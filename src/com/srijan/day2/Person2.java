package com.srijan.day2;

public class Person2{
    private String name;
    private int age;
    public Person2(){}
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public static void main(String [] args){
        Person2 p= new Person2();
        p.setAge(19);
        p.setName("Srijan");
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }

}