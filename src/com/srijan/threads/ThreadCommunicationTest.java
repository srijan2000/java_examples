package com.srijan.threads;

public class ThreadCommunicationTest {

    public static void main(String[] args) {
        Item item = new Item();

        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);
        producer.start();
        consumer.start();
    }
}


class Item {

    private int count;
    private volatile boolean flag;

    synchronized public void set(int count){
        while(flag == false) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        this.count = count;
        flag = false;
        notify();
    }

    synchronized public int get(){
        while(flag) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        flag = true;
        notify();
        return this.count;
    }
}

class Producer extends Thread{

    private Item item;

    public Producer(Item item){
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

class Consumer extends Thread{

    private Item item;

    public Consumer(Item item){
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




