package com.codewithNIGGA;

import java.util.ArrayList;

public class Multidimension_Array_List {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // we are just making a 2d arraylist
        // just similar to an int[][] integer 2d array
        // we need to initialize an array list of another array
        // this is the same technique
        // here we are just making an arraylist inside of an arraylist instead making a 2d array list
        // where in 2d array list we need to make an array inside of another array
        // to be more precise col array inside row array as printing does not happen in column wise format
        // it happens in a row wise format

        // initialization

        for (int i = 0; i <3 ; i++)
        {
            list.add(new ArrayList<>());
        }
        // we are initializing  3 array lists
        // inside of a single array list
        
    }
}
