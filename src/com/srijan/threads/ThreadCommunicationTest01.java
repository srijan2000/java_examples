package com.srijan.threads;


public class ThreadCommunicationTest01 {

    public static void main(String[] args) {
        Item1 item = new Item1();

        Producer1 producer = new Producer1(item);
        Consumer1 consumer = new Consumer1(item);
        producer.start();
        consumer.start();
    }
}


class Item1 {

    private int count;
    private boolean flag;

    public   void set(int count){
        synchronized(this) {
            while (flag == true) {
                System.out.println("Producer: waiting...");
                try {
                    wait();
                    System.out.println("Producer: acquired lock...");
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            this.count = count;
            flag = true;
            notifyAll();
        }
    }

    public synchronized int get(){
        while(flag == false) {
            System.out.println("Consumer: waiting...");
            try {
                wait();
                System.out.println("Consumer: acquired lock...");
            } catch (InterruptedException ie) {

                ie.printStackTrace();

            }
        }
        flag = false;
        notifyAll();
        return this.count;
    }
}

class Producer1 extends Thread{

    private Item1 item;

    public Producer1(Item1 item){
        this.item = item;
    }

    @Override
    public void run(){
        int num = 0;
        while(true){
            System.out.println("Producing :" + num);
            item.set(num++);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Consumer1 extends Thread{

    private Item1 item;

    public Consumer1(Item1 item){
        this.item = item;
    }

    @Override
    public void run(){

        while(true){
            System.out.println("Consumed: " + item.get());
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
