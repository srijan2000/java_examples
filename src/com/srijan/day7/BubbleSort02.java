package com.srijan.day7;

import java.io.BufferedReader;
import java.util.Scanner;

public class BubbleSort02 {
    public void  bubbleSort(int[] arr){
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            for(int j=0 ;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public void printArray(int [] arr){
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");

        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Before sorting.......");

        for (int i =0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(array);
        System.out.println("Sorted array");
        ob.printArray(array);

    }
}
