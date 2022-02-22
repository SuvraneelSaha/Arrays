package com.codewithNIGGA;

import java.util.Scanner;

public class Multidimension_Arrays_ONE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // multi dimension arrays -
        // imagine this as arrays of arrays
        // where 0 index acts as an array
        // where 1 index acts as an array
        // and so on so forth
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2D ={
                {1,2,3}, // 0 th index
                {4,5},  // 1st index
                {6,7,8,9} // 2nd index
                // no error
                // individual size of array can vary as well
                // cause each array is of diff object
                //
        };

        // hard coded initialization of 2d arrays
         /*
         so arr[1][0] will be 4

          */

        // size of the individual rows does not matter
        // it can have variable no. of rows
        // so it is not necessary to assign beforehand the no. of columns
        // as each row will act as an individual array itself
        //



    }
}
