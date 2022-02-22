package com.codewithNIGGA;

import java.util.Arrays;
import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        // arrays of objects
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        // this actually contains ref var to the objects and the objects are stored anywhere in the heap
        //



        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
            // next is for the word or a single letter
            // next line takes the whole line as an input

        }
        System.out.println(Arrays.toString(str)); // aa bb cc dd

        str[1] ="kunal"; // aa kunal cc dd
        System.out.println(Arrays.toString(str));
        // o/p will be aa kunal cc dd the value of the ref var str[1] will be changed to kunal
        // and it will be printed

//        for(String element:str)
//        {
//            System.out.println(element);
//
//        }
        // emhanced for loop


    }
}
