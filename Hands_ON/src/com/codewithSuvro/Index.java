package com.codewithSuvro;

// Null
// Index

public class Index {
    public static void main(String[] args) {
        // what are indexes

        // these are just numbers which start from 0 and continue till infinity

        int[] roll = new int[5];
        System.out.println(roll[3]);
        // for an int array by default it will have all the 0 elements
        // internally it will be like this
        // [0,0,0,0,0]

        String[] arr = new String[4];
        System.out.println(arr[0]);

        // this will show null as it does not contain any values or we could say its none
        //
        // null is a literal

        String a = null;
        // no error cause String is not a primitive data type
        // it is non primitive data type

        // again
       //  int b = null;
        // this will give an error
        // cause int is a primitive data type


        // IMP -- >
        // any reference variable that we have by default its going to have null type  / value
        // ex -
        int[] Roll ;
        // this Roll variable's value is null by default
        // as it has not been initialized

        //  null is not a datatype
        // only can be assigned with non primitives
        // by default value of primitives or what the reference variables point to





    }
}
