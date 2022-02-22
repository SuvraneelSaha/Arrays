package com.codewithSuvro;

import java.util.Scanner;

public class INPUT_ONE {
    public static void main(String[] args) {
        // array input using for loop

        Scanner in = new Scanner(System.in);// inputstream ie cmd or the keyboard

        int[] arr = new int[5];

        // this is for the taking input
        for (int i = 0; i <arr.length ; i++)
        // we may not always know the length of the array so we have used the function arr.length
        {
            arr[i] = in.nextInt();
        }
        // this is for printing the values
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i] + " ");

        }




    }
}
