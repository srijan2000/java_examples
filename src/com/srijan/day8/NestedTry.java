package com.srijan.day8;

public class NestedTry {

    public static void main(String args[]){

        try {

            int x= args.length;
            System.out.println("X="+x);

            int y = 2 / x;
            System.out.println("Y =" + y);

             try {

                 if (x == 1) {
                     x = x / (x - x);
                 }

                 if (x == 2) {
                     int c[] = {1};
                     c[2] = 32;
                 }
             }

             catch (ArrayIndexOutOfBoundsException ae) {
                 System.out.println("out of bounds exception " + ae);
             }

            catch (ArithmeticException e) {
                System.out.println("Divide by zero " + e);
            }

        }
        catch (Exception re){
            System.out.println("Caught an error "+ re);
        }
    }
}
