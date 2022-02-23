package com.codewithNIGGA;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // we use array list when we dont know how much size the user wants
        // or how many nos the user will enter

        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(5); // initial capacity means that it will take in minimum of 10 elements
        // in the right side ArrayList<Integer>() the data type is not necessary
        // we can also leave it blank as ArrayList<>();

        // we need to specify the data type we are using
        // int cannot be used be need to use wrapper classes ie proper 9Integer) -- like this

        list.add(21);
        list.add(123123);
        list.add(4123);
        list.add(23);
        list.add(22);
        list.add(2020);
        list.add(2112);

        System.out.println(list);
    // printing all the items or elements present inside the list data type
        // it allows us to allocate an unkown nos or elements into a data structure that can be used later on
        // the minimum capacity does not matter but we specify as it is a good practice
        


    }
}
