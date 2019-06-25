package com.srijan.day14;

import java.util.Scanner;

public class BubbleSort3 {

    private int size;
    private int[] nums;

    public BubbleSort3(){}

    public BubbleSort3(int size, int[] nums){
        this.size = size;
        this.nums = nums;
    }

    void bubblesort() {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
    }


    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(nums[i] +", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        BubbleSort3 bs = new BubbleSort3(size, array);
        bs.display();
        bs.bubblesort();
        bs.display();
    }
}
