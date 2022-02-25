package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_OF_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the size");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements:");
        // scanning
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
       int[] ans = new int[2*arr.length];

        for (int i = 0; i <arr.length ; i++)
        {
            ans[i] = arr[i];// 11 ans[0] = 11
                            // 22 ans[1] = 22
                            // 33 ans[2] = 33

        }
        for (int i = 0; i < arr.length ; i++) {
            ans[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(ans));







    }
}
