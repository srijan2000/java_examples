package com.srijan.day8;
class MyOwnException extends Exception{
    public MyOwnException(){}
    public String toString(){
        return "MyOwnException type error";
    }
}
public class CreateException {
    static void add (int a ,int b)throws MyOwnException{
        if((a<0)||(b<0)){
            throw new MyOwnException();
        }
        System.out.println("Sum = "+ (a+b));
    }
    public static void main(String [] args){
        try {
            add(50,100);
            add(30,-20);
        }
        catch (MyOwnException e){
            System.out.println("caught "+ e);
        }
    }
}
