package com.srijan.day4;

public class Triangle implements Shape1 {
    double breadth;
    double height;
   public Triangle(double breadth,double height) {
       this.breadth = breadth;
       this.height = height;
   }
        double getBreadth(){
            return this.breadth;
        }
        double getHeight(){
            return this.height;
        }
        public double calculateArea(){
            return 0.5* this.breadth* this.height;
        }


}

