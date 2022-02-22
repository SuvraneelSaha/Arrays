package com.codewithSuvro;

import java.util.Scanner;

public class For_Each {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int num : arr) // FOR EVERY ELEMENT OF THE ARRAY PRINT THE ELEMENT
        {
            System.out.print(num+" "); // HERE NUM REPRESENTS ELEMENTS OF THE ARRAY IE


        }
        // same as the above

        // 1]THIS IS ONE METHOD OR TECHNIQUE TO PRINT THE ELEMENTS OF AN ARRAY

        // 2]FOR EACH LOOP IS ANOTHER METHOD TO PRINT THE ELEMENTS OF THE ARRAY

        // 3 ] ARRAYS TO STRING IS ANOTHER METHOD
        // ARRAYS.TOSTRING() METHOD IS PREDEFINED

        /*
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println(arr[i]);

        }
         */


    }
}
