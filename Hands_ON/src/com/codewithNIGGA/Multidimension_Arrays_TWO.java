package com.codewithNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_Arrays_TWO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
       // System.out.println("no. of rows is "+arr.length); // no of rows // only row will be considered
        // this will always print the length of the array
        // when printing the length of the array the size of the row will be considered


        // input
        for (int row = 0; row <arr.length ; row++) // outer for loop its iterating each row
            // for every for we are iterating every column using another for loop
        {
            // for each col of each row 
            for (int col = 0; col <arr[row].length ; col++)
            {
            // individual size of the rows only we need that many amount of columns
                // that is the reason why we dont need to define the size of the columns as
                // it is totally dependent on the size of the rows


                arr[row][col] = in.nextInt();

            }
        }

//        // output
//        for (int row = 0; row < arr.length; row++)
//        {
//            for (int col = 0; col <arr[row].length ; col++)
//            {
//
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println(); // for the matrix looking view
//        }

        // this was the first method of printing the elements of the 2d array




        // output
        for (int row = 0; row < arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
            // each element of the array is an array itself
            // index 0 is an array itself with 3 elements
            // index 1 is an array itself with 3 elements
            // index 2 is an array itself with 3 elements
            // printing using toString method
            // 2nd method
        }

        System.out.println();

        // 3rd method of printing
        // enhanced for loop + arrays.to string combo
        for(int[] a:arr )
        {
            System.out.println(Arrays.toString(a));

        }
        // in this case outside the main array
        // every single element is in itself is an array
        // thats why we are saying every single element is in itself is an array 



    }
}
