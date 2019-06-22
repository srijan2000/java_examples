package com.srijan.day2;
class  Books {
    String title;
    String author;
}
public class BooksTestDrive {
    public static void main(String [] args){
        Books [] myBooks = new Books[3];
        int x=0;
        myBooks[0]= new Books();
        myBooks[1]=new Books();
        myBooks[2]= new Books();
        myBooks[0].title = "ou is great";
        myBooks[1].title="java is great";
        myBooks[2].title="java is cook book";
        myBooks[0].author= "srijan";
        myBooks[1].author="sue";
        myBooks[2].author="ian";
        while(x<3){
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
            x=x+1;
        }

    }
}
