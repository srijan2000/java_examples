package com.srijan.day8;

import java.util.ArrayList;

public class ThrowUsage {
    static int x =5,y=0,z;

   static int div(){
       try {
           if(y== 0){
               throw new ArithmeticException("Divison by zero");
           }
           else {
               return x/y;
           }
       }

       catch(ArithmeticException ae){
           System.out.println("Arthemtic exception xaught at div()");
           throw ae;
       }
   }

       public static void main(String [] args){
           try {
               z = div();
               System.out.println("Z="+ z);
           }
           catch (ArithmeticException ae){
               System.out.println("Exception recaught at main()"+ae);
           }
       }


}
