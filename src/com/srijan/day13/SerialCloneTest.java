package com.srijan.day13;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class SerialCloneTest {
    public static void main(String[] args) {
        Employ harry = new Employ ("Harry Hacker",35000,1999,10,1);
        Employ harry2  = (Employ) harry.clone();
        System.out.println(harry);
        System.out.println(harry2);
    }
}
class  SerialCloneable implements Cloneable,Serializable{
    private Object ret;

    public  Object clone(){
        try{
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(this);
            out.close();

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            Object rect = in.readObject();
            in.close();
            return ret;
        }
        catch (Exception e){
            return null;
        }
    }
    
}
class Employ extends SerialCloneable{
    public Employ(String n,double s, int year,int month,int day){
        name = n;
        salary =s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
        
    }
    public String getName(){
        return name;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public String toString(){
     return name+ salary+ hireDay;   
    }
    private String name;
    private double salary;
    private Date hireDay;
}
