package com.codewithNIGGA;

import java.util.Scanner;

//Q: column having no fixed size
public class Col_NO_Fixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++)
            // arr[row].length is used
                // whenever there is no fixed size of the column

            {
                System.out.print(arr[row][col] + " ");
                // println is for new line
                // print is for single line outputting
            }
            System.out.println();

        }
    }
}
