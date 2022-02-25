package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_Try {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = new int[arr.length] ;
        int sum =0 ;
        for (int i = 0; i < arr.length ; i++) // arr[0] = 1
                                              // arr[1] = 2
        {
            sum = sum+arr[i];

            ans[i] += sum;



        }

        System.out.println(Arrays.toString(ans));

    }
}
// input [1,2,3,4]
// output [1,3,6,10]
