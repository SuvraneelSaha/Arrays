package com.codewithNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class Passing_In_Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    // what is happening
    static void change(int[] arr)
    {
        arr[0] = 99 ;
    }
}
// the kunal baby haircut example
// nums -- {1,2,3,4}

//  the copy of the ref var nums is passed to the function

// the name of the ref var in the function is arr and it is pointing to the same object
    // and in the function change
// we are changing the arr[0] = 99

// and as a result the original object is changed

// THIS IS KNOWN AS MUTABLE BEHAVIOUR
// STRINGS ARE NOT MUTABLE IN JAVA -- > IMMUTABLE
// BUT ARRAYS ARE MUTABLE IN JAVA
// MUTABLE MEANS - WE CAN CHANGE THE OBJECT