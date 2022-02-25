package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

//Q:permutation of array
public class Permutation_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input
        //Input: nums = [0,2,1,5,3,4]
        // [0,1,2,4,5,3] output
        /*
        Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
         */
// nums[0],nums[2],nums[1],nums[5],nums[3],nums[4]
        // this will be the arrangement of elements
        int[] arr = {0,2,1,5,3,4};
        int[] ans = new int[6];
        for (int i = 0; i < arr.length ; i++)
        {
            ans[i] = arr[arr[i]]; // ex1 - arr[arr[0]] = arr[0] = 0 is the element  ; this gets stored in arr[0]
            // ex 2 - arr[arr[1]] = arr[2] = 1 is the element ; it gets stored in arr[1]
            // explanation
            // the element which is coming from arr[i] acts as the new assigned index of the array arr
            // ie in the 1st step
            // arr[i] becomes an element
            // then arr[arr[i]] becomes an


        }
        System.out.println(Arrays.toString(ans));





    }
}
