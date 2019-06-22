package com.srijan.day1;

public class TapeDeck {
public static void main(String [] args){
    TapeDeckTestDrive t = new TapeDeckTestDrive();
    t.canRecord =true;
    t.playTape();
    if(t.canRecord=true){
        t.recordTape();
    }
}
}
class TapeDeckTestDrive{
    boolean canRecord = false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");

    }
}
