package com.srijan.day6;

public class NonGenericType {

    private Object info;

    public Object get(){
        return this.info;
    }

    public void set(Object info){
        this.info = info;
    }

    public static void main(String[] args) {
        NonGenericType nonGenericType = new NonGenericType();

        nonGenericType.set("Srijan");
        String name = (String)nonGenericType.get();
        System.out.println(name);

        nonGenericType.set(12345);
        Integer num = (Integer)nonGenericType.get();
        System.out.println(num);
    }
}
