package com.srijan.day7;

import  com.srijan.day2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public List<Employee> addEmployee(){

        List<Employee> list = new ArrayList<>();
        Employee e = new Employee("virat","kohli",29,567);
        list.add(e);
        e = new Employee("bumarah","jasprith",23,345);
        list.add(e);
        return list;
    }
    public static void main(String [] args){

        EmployeeList el= new EmployeeList();
        List<Employee> list = el.addEmployee();

        for(int i=0; i< list.size() ;i++) {
            Employee e = list.get(i);
            System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getAge());
        }
    }
}
