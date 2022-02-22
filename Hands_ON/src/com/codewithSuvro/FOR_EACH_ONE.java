package com.codewithSuvro;

import java.util.Scanner;

public class FOR_EACH_ONE {
    public static void main(String[] args) {
        // syntax of the for each loop
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the elements you want to enter:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }

        // this is the syntax of the for each loop
        // it is usually used for printing the elements of an array


        for (int num:arr)
        {
            System.out.print(num + " ");

        }
    }
}
