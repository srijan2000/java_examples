package com.srijan.day6;

public class GenericType<T> {

    T info;

    public void set(T info){
        this.info = info;
    }

    public T get(){
        return this.info;
    }

    public static void main(String[] args) {
        GenericType<String> genericType = new GenericType<>();
        genericType.set("Srijan");
        String name = genericType.get();
        System.out.println(name);

        GenericType<Double> doubleGenericType = new GenericType<>();
        doubleGenericType.set(3.45);
        double d = doubleGenericType.get();
        System.out.println(d);

    }
}
