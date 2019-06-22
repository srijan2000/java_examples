package com.srijan.day13;

public class Demo extends Thread {

    @Override
    public void run(){
        for(int i=1;i<10;i++){
            String str = Thread.currentThread().getName();
            System.out.println(str + ":"+i);
        }
    }

    public static void main(String[] args) {

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();

        obj1.setName("First Thread");
        obj2.setName("Second Thread");
        obj3.setName("Third thread");

        obj1.setPriority(NORM_PRIORITY);
        obj2.setPriority(MAX_PRIORITY);
        obj3.setPriority(MIN_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("Priority of 1st thread :"+ obj1.getPriority());
        System.out.println("Priority of 2nd thread :"+ obj2.getPriority());
        System.out.println("Priority of 3nd thread :"+ obj3.getPriority());

    }
}
