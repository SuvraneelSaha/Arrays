package com.codewithNIGGA;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimension_Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < list.size() ; j++)
            // list.size() for knowing the size of the lenght of the row just like in the case of an int[][] array


            {
                list.get(i).add(in.nextInt());


            }

        }

        System.out.println(list);



    }
}
//IMP
// we can actually use the 2d array in case of storing many array inside of a single array
// just like the int[][] array where each index element is a array itself
//  so
// THE ARRAYLIST IS UST LIKE AN ARRAY
// &&
// THE MULTI DIMENSION ARRAYLIST IS LIKE 2D ARRAY

