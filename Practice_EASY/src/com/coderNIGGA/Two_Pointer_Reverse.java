package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Pointer_Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("OG array:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        in.close();

    }
    static void reverse(int[] arr)
    {
        int start = 0 ;
        int end = arr.length -1 ; // cause we are taking the index value
        // otherwise there would array out of bounds error
        while (start<end)
        {
            swap(arr,start,end);
            start ++ ;
            end -- ;


        }
    }
    static void swap(int[] arr , int start , int end)
    {
        // swapping of the two numbers will take place
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
