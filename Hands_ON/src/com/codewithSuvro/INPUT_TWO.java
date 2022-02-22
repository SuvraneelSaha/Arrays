package com.codewithSuvro;

import java.util.Scanner;

public class INPUT_TWO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the no. of elements to enter :");

        int n = in.nextInt();

        int[] arr = new int[n];

        // this is for the taking input
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println("please enter the no.");
            arr[i]=in.nextInt();

        }

        //this is for the printing
        for (int i = 0; i <arr.length ; i++)
        {

            System.out.print(arr[i] +" ");


        }

    }
}
