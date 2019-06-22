package com.srijan.day1;

public class DogTestDrive {
    public static void main(String[] args){
       Dog dog = new Dog();
       dog.size = 30;
       dog.breed="lab";
       dog.name="sran";
       dog.bark();
        System.out.println(dog.size+" "+dog.breed+" "+dog.name);

    }

}
