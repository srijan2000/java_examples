package com.srijan.day7;

import java.util.Scanner;

public class BubbleSort {

        void bubbleSort(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }


        void printArray(int[] arr)        {
            int n = arr.length;
            for (int i=0; i<n; ++i) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");

            int size = sc.nextInt();

            int[] array = new int[size];

            for(int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }

            System.out.println("Before sorting...");

            for(int i = 0; i< array.length; i++){
                System.out.print(array[i] + "   ");
            }

            BubbleSort ob = new BubbleSort();
            ob.bubbleSort(array);
            System.out.println("Sorted array");
            ob.printArray(array);
            /*BubbleSort ob = new BubbleSort();
            int arr[] = {64, 34, 25, 12, 22, 11, 9};
            ob.bubbleSort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);*/
        }
    }

