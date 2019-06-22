package com.srijan.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        Item3 item = new Item3();

        Producer3 producer3 = new Producer3(item);
        Consumer3 consumer3 = new Consumer3(item);
        producer3.start();
        consumer3.start();
    }
}


class Item3{

    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);

    public  void producer() throws InterruptedException{
        Random random = new Random();
        while(true) {
            int val = random.nextInt(100);
            blockingQueue.put(val);
            System.out.println("Produced: " + val);
        }
    }

    public  void consumer() throws InterruptedException {
       // Random random = new Random();
        while (true){
            Thread.sleep(100);
            //if(random.nextInt(10) == 0){
                int val = blockingQueue.take();
                System.out.println("Consumed: " + val + " quequ size is " + blockingQueue.size());
            //}
        }
    }

}

class Producer3 extends Thread{

    private Item3 item;

    public Producer3(Item3 item){
        this.item = item;
    }

    public void run(){
        try{
            Thread.sleep(1000);
            item.producer();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

}

class Consumer3 extends Thread{
    private Item3 item;

    public Consumer3(Item3 item){
        this.item = item;
    }

    public void run(){
        try{
            Thread.sleep(1000);
            item.consumer();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}



