package com.codewithNIGGA;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example_ONE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        // the initial capacity is 5
        // but it can exceed the capacity and it wont give an error
        // this is the advantage of using arraylists
        // also it has many cool methods which are predefined

        list.add(0);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);


        System.out.println(list);


        System.out.println(list.contains(6)); // this will check whether it contains the element 6 or not
        // checks in accordance with element
        // not with index
        // prints out the boolean value ie true or false

        list.set(0,99);
        // .set for replacing the element at the specific index with another element
        // ex - list.set(1,222) ;
        // 1 is the index position
        // and 222 is the value of the element at the index position 1


        System.out.println(list);

        System.out.println(list.remove(1));
        // this method or function list.remove(index position)
        // helps to remove the element present at the position 1 or ant specified position ie index given by the user
        // this System.out.println(list.remove(1)); will only show the deleted item on the cmd

        System.out.println(list);







    }

}
