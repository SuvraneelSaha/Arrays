package com.QUESTIONS;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no. of elements the user will enter:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the greatest no. is "+max(arr));


    }
    static int max(int[] arr)
    {
       // int max =0;
        // we could also initialize max var as 0
        // we can initialize the max value as the starting element
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
