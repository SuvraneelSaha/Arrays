package com.coderNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation_Array_Leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];


        System.out.println("please enter the array :");
        for (int i = 0; i < nums.length ; i++)
        {
            nums[i] =in.nextInt();
        }
        int[] ans =buildArray(nums);
        System.out.println(Arrays.toString(ans));





    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];

        }
        return ans;

    }

}


