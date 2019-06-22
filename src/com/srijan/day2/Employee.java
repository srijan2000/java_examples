package com.srijan.day2;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary){
        super(firstName, lastName, age);

        this.salary = salary;
    }


    public void display(){
        super.display();
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args){
        Employee emp = new Employee("Srijan", "Veerareddy", 19, 89898989.98);
        emp.display();
    }

}
