package com.srijan.day14;

import java.util.Scanner;

public class BubbleSortt1 {

    void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                }
            }
        }
    }


        public void PrintArray (int [] arr) {

            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main (String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");

            int size = sc.nextInt();

            int[] array = new int[size];

            for(int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }

            System.out.println("Before sorting...");

            for(int i = 0; i< array.length; i++) {
                System.out.print(array[i] + "   ");
            }

            BUbblesort ob = new BUbblesort();
            ob.bubbleSort(array);
            System.out.println("Sorted array");
            ob.printArray(array);

        }

}
