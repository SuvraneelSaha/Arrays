package com.QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_User {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no. of elements inside the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        //  for taking input no alternative is present
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
//            for (int i = 0; i <arr.length ; i++)
//            {
//
//                System.out.println(Arrays.toString(arr));
//
//            }
    // this will print the same array 5 times as n is equal to 5

        System.out.println(Arrays.toString(arr));
        System.out.println("please enter the indexes you want to interchange or swap :");
        int a= in.nextInt();
        int b= in.nextInt();
        swap(arr,a,b);
        // if we explicitly assign numbers then IDEA  will show them the assigned vars
        // but when we do assign implicitly thats not gonna happen

        System.out.println(Arrays.toString(arr));


        


    }
    static void swap(int[] arr,int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
