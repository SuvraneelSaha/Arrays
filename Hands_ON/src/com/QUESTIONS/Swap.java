package com.QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

//Q : swap two elements given by the user in an int array
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,22,33,44,55,66,77};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1,int index2)
    {
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;


    }
}
