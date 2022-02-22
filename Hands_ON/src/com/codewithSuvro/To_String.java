package com.codewithSuvro;

import java.util.Arrays;
import java.util.Scanner;

public class To_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // THIS IS AN ARRAY OF PRIMITIVES
        // PRIMITIVES ARE OF INT CHAR  BOOLEAN FLOAT

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();


        }

        // ARRAYS HAS A TOSTRING METHOD WHICH IS PREDEFINED WHEN WE GIVE AN ARRAY TO IT
        // IT WILL COVERTS IT INTO A STRING AND PRINTS IT
        //

        System.out.println(Arrays.toString(arr));
        // THIS IS THE BEST WAY TO PRINT AN ARRAY



    }
}
