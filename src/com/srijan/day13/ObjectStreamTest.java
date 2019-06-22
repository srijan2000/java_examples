package com.srijan.day13;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObjectStreamTest {
    public static void main(String[] args) {
        
        Empl harry = new Empl("Harry Hacker ",50000,1234,10,1);
        Manager carl = new Manager ("Carl Cracker ",80000,1234,3,15);
        carl.setSecretary(harry);

        Manager tony = new Manager ("Tony Tester ",10000,1234,3,15);
        tony.setSecretary(harry);
        Empl [] staff = new Empl[3];
        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.day"));
            out.writeObject(staff);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.day"));
            Employ[] newStaff = (Employ[]) in.readObject();
            in.close();

            for (Employ e : newStaff) {
                System.out.println(e);
            }
        }
            catch(Exception e){
                e.printStackTrace();

            }

    }
}
class Empl implements Serializable{
    public Empl(){}
    public Empl( String n, double s,int year,int month,int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary + byPercent/100;
        salary+= raise;
    }
    private String name;
    private double salary;
    private Date hireDay;

}
class Manager extends Empl{
    public Manager(String n,double s, int year, int month,int day){
         secretary = null;
    }
    public void setSecretary (Empl s){
        secretary =s;
    }
    public String toString (){
        return super.toString() +"[secretary ="+ secretary +"]";

    }
    private Empl secretary;
}

