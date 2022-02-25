package com.QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the no. of elements:");

        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements");

        // for scanning
        for (int i = 0; i < arr.length; i++) {
            arr[i] =in.nextInt();
        }
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("new array");
        System.out.println(Arrays.toString(arr));



    }
    static void reverse(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1;

        // there would be two variables that will control the flow and change of the swapping
        // the first variable will increase by 1
        // and the second variable will decrease by 1
        // the start var will be assigned to 0th index
        // the end var will be assigned to n-1th index
        // and when the swapping would be complete the start var will be greater than the end var and thats
        // when the while loop will end
        // and it will return the function

        while (start<end)

        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    // this swap function is necessary for reversing the elements in an array
    // cause it will change each of the starting index elements with another ending index element
    // with the help of a while loop which is in the reverse function
    // inside the while loop of the reverse function the swap function will be called and it will change its elements
    // in the mean time the start var and end var will increase and decrease respectively in order
    // to change each element with another

    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];//copy of the index 1 element is being stored in the temp var
        arr[index1] = arr[index2]; // index 2 ref var is now empty
        arr[index2] = temp;
    }
}
