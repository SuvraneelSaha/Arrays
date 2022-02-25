package com.QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;
//Q: reverse an array
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the total digit no:");
        int n = in.nextInt();
        System.out.println("pleae enter the elements :");
        int[] arr = new int[n];
        // for taking input
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("original array:");
        System.out.println(Arrays.toString(arr)); // the next line will be printed in the same line
//        System.out.println("please enter the two indexes that are going to interchange");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        swap(arr,a,b);
//        System.out.println(Arrays.toString(arr));
// this above is for the swapping function
        reverse(arr);
        System.out.println(Arrays.toString(arr));





    }
    static void reverse(int[] arr)// scoping
    {
        int start = 0 ;
        int end = arr.length- 1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;


        }
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];//copy of the index 1 element is being stored in the temp var
        arr[index1] = arr[index2]; // index 2 ref var is now empty
        arr[index2] = temp;
    }

}
