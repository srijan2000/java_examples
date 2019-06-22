package com.srijan.day11;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EmployeeReadWriter {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Srijan Veerareddy", 123455, 2018, 3, 19);
        employees[1] = new Employee("Chintu Bandi", 103405, 2019, 6, 23);
        employees[2] = new Employee("Rakesh Garlapati", 163105, 2008, 7, 11);

        try{
            //writing into file
            PrintWriter pw = new PrintWriter("employee.dat");
            writeEmployee(pw,employees);
            pw.close();
            //reading from file
            Scanner scanner = new Scanner(new FileReader("employee.dat"));
            Employee[] emp = readEmployee(scanner);
            scanner.close();

            for(Employee e : emp){
                System.out.println(e);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeEmployee(PrintWriter out, Employee[] emp){
        out.println(emp.length);
        for(Employee e: emp){
            e.writeData(out);
        }
    }

    public static Employee[] readEmployee(Scanner in){
        int n = in.nextInt();
        in.nextLine();
        Employee[] emp = new Employee[n];

        for(int i = 0; i < n; i++){
            emp[i] = new Employee();
            emp[i].readData(in);
        }

        return emp;
    }


}

class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(){}

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDay = calendar.getTime();
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public Date getHireDay(){
        return this.hireDay;
    }

    @Override
    public String toString(){
        return  this.name + "," + this.salary + "," + this.hireDay ;
    }

    public void writeData(PrintWriter pw){

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(hireDay);

        pw.println(this.name +"|" + this.salary + "|" + calendar.get(Calendar.YEAR) + "|" + (calendar.get(Calendar.MONTH) + 1) + "|" + calendar.get(Calendar.DAY_OF_MONTH) );
    }

    public Employee readData(Scanner in){

        String line = in.nextLine();
        String[] tokens = line.split("\\|");

        this.name = tokens[0];
        this.salary = Double.parseDouble(tokens[1]);

        int year = Integer.parseInt(tokens[2]);
        int month = Integer.parseInt(tokens[3]);
        int day = Integer.parseInt(tokens[4]);

        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.hireDay = cal.getTime();

        return this;

    }

}
