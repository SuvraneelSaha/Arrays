package com.codewithNIGGA;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example_THREE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no. of items the user will take :");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(5);


        // this is for the input ie for taking the integers as the arraylist is of integer type
        for (int i = 0; i < n; i++)
        {
            list.add(in.nextInt());
        }

        // this is for the printing

        for (int i = 0; i <n ; i++)
        {
            System.out.println(list.get(i));
            //  pass index here ,   list[index] syntax will not work here
            // we need to use .get function with the arraylist so that we could print the elements


        }


    }
}
