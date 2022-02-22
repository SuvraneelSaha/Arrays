package com.codewithSuvro;

import java.util.Scanner;

public class Outofbounds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println(arr[5]);
        // Error throwing
        //Index 5 out of bounds for length 5
        // index out of bounds problem



    }
}
