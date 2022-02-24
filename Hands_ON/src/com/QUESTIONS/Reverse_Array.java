package com.QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the total digit no:");
        int n = in.nextInt();
        int[] arr = new int[n];
        // for taking input
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        


    }
}
