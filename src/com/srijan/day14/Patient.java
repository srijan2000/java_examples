package com.srijan.day14;

public class Patient {

  public String firstName;
  public String lastName;
  public String suffering;
  public int age;
  public int howLong;

   Patient(){}

   Patient(String firstName, String lastName, int age){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
   }

   Patient(String firstName , String lastName,String suffering, int age, int howLong){

       this(firstName,lastName,age);
       this.suffering = suffering;
       this.howLong = howLong;

   }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
       return this.lastName;
    }

    public String getSuffering(){
       return this.suffering;
    }

    public int getAge(){
       return this.age;
    }

    public int getHowLong(){
       return this.howLong;
    }

    @Override
    public String toString() {
        return firstName +", "+ lastName +","+ suffering+"," + age +","+  howLong;
    }

    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("srijan","veerareddy",23);
        Patient p3 = new Patient("srijan","Veerareddy","virus",29,2);
        System.out.println( p3.getFirstName());
        System.out.println(p3.getLastName());
        System.out.println(p3.getSuffering());
        System.out.println(p3.getAge());
        System.out.println(p3.getHowLong());

        System.out.println(p3.toString());

    }

}
