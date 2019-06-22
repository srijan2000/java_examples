package com.srijan.day1;

public class StrArray {

    String[] wordListone = {"srijan","shewag","virat","rahul"};
    String[] wordListtwo ={"bhuvi","bumrah","jadeja","shami"};
    String[] wordListthree ={"dhoni","karthik","kuldeep","chahal"};


    public void process(){

        int oneLength = wordListone.length;
        int twoLength = wordListtwo.length;
        int threeLength = wordListthree.length;

        int rand1 = (int)(Math.random()*oneLength);
        System.out.println(wordListone[rand1]);
        int rand2 = (int)(Math.random()*twoLength);
        System.out.println(wordListtwo[rand2]);
        int rand3 = (int)(Math.random()*threeLength);
        System.out.println(wordListthree[rand3]);
        System.out.println(rand1+" "+rand2+" "+ rand3);

    }

    public static void main(String[] args){

         StrArray strArray = new StrArray();
         strArray.process();

    }

}