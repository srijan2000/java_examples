package com.srijan.day1;

public class Guessgame {

    player p1;
    player p2;
    player p3;

    public void startGame(){
        p1 = new player();
        p2 = new player();
        p3= new player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int) (Math.random()*10);

        System.out.println("I'm thinking of a number between 0 and 9 ");
        while (true){
            System.out.println("Number to guess is "+ targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            guessp2=p2.number;
            guessp3 = p3.number;
            if(guessp1==targetNumber) {
                p1isright = true;
            }
            if (guessp2== targetNumber){
                p2isright = true;
            }
            if (guessp3== targetNumber){
            p3isright = true;
            }
            if(p1isright || p2isright || p3isright){
                System.out.println("we have a winner");
                System.out.println("player one got it right ?"+ p1isright);
                System.out.println("player two got it right ?"+ p2isright);
                System.out.println("player three got it right ?"+ p3isright);
                System.out.println("game is over");
                break;
            }
            else {
                System.out.println("players will have to try again");
            }

        }
    }
}
