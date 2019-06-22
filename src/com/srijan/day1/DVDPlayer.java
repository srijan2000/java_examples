package com.srijan.day1;

public class DVDPlayer {

    public static void main(String [] args){
        DVDTestDrive d = new DVDTestDrive();
        if(d.canrecord = true){
            d.recordDvd();
        }
    }
}
class DVDTestDrive{
    boolean canrecord = false;

    void recordDvd(){
        System.out.println("Dvd recording");
    }

}
