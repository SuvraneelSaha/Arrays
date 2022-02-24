package com.codewithNIGGA;

import java.util.ArrayList;
import java.util.Scanner;
//Q : experimenting with array list

public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(0);
        // here the index will be considered not the element in the list only the index at which deletion
        // will occur and the element will be deleted
        System.out.println(list);
        list.add(0,11);
        System.out.println(list);
        list.set(1,222);
        System.out.println(list);




    }
}
