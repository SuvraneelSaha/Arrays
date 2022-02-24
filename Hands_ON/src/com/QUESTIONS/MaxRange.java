package com.QUESTIONS;

import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no. of elements:");
        int n = in.nextInt();
        System.out.println("enter the elements :");
        int[] arr = new int[n];
        // for scanning the inpurs
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("please enter the range start and the end");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("the greatest no. is "+ Max_Range(arr,a,b));


    }
    static int Max_Range(int[] arr, int a, int b)
    {
        // we could also initialize the max value as 0
        // but this method is more efficient for dynamic purposes
        // we could also use the starting value as the max value
        // ie
        int max = arr[a];
        // we treat this arr[a] that is the starting element as the maximum value cause
        // for optimization and again for better use

        for (int i = a; i <=b ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
