package com.srijan.day12;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TextFileTest {

    public static void main(String[] args){

      Employee[] staff = new Employee[2];
      staff[0] = new Employee("Anitha",23455,2000,12,13);
      staff[1] = new Employee("venkatram reddy",234444444,1990,2,1);

        try{
            //writing into file
            PrintWriter pw = new PrintWriter("employe01.dat");
            writeEmployee(pw,staff);
            pw.close();
            //reading from file
            Scanner scanner = new Scanner(new FileReader("employe01.dat"));
            Employee[] emp = readEmployee(scanner);
            scanner.close();

            for(Employee e : emp){
                System.out.println(e);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeEmployee(PrintWriter out,Employee[] emp){
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

    public Employee(String n,double s,int year,int month,int day){
        this.name = n;
        this.salary = s;
        GregorianCalendar cal = new GregorianCalendar(year,month-1,day);
        this.hireDay = cal.getTime();
    }

    public String getName(){
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public String toString(){
        return  this.name + "," + this.salary + "," + this.hireDay ;
    }

    public void writeData(PrintWriter pw){

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(this.hireDay);

        pw.println(this.name +"|" + this.salary + "|" + calendar.get(Calendar.YEAR) + "|" + (calendar.get(Calendar.MONTH) + 1) + "|" + calendar.get(Calendar.DAY_OF_MONTH) );
    }

    Employee readData(Scanner in){

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
