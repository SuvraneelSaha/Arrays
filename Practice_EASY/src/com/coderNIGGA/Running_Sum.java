package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size :");
        int n = in.nextInt();
        int[] arr = new int[n];
        // scanning
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        int[] ans = sum(arr);
        System.out.println(Arrays.toString(ans));



    }
    static int[] sum(int[] arr)
    {
        int[] ans=new int[arr.length];
            int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
            ans[i] +=sum;
        }
        return ans;
    }
}
