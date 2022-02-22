package com.codewithSuvro;

public class Null_ONE {
    public static void main(String[] args) {

        String[] arr = new String[5];
        // internal working of object ie in here we are talking about the String which is a non primitive data type


        //IMP

        // primitives are stored in the stack memory only

        // objects are stored in heap memory ex- string ,array , structures , hash map are all stored in heap memory

        // reference var are stored in the stack memory

        /*
         the arr is stored in the stack memory

         the objects are stored in the heap memory and it is being pointed by the ref var named (arr)

         it contains 5 elements

         each particular element in itself is an object and entire each objects are stored in diff parts of the memory

         and for each element - arr[0] will be its ref var

         all the ref var by default will point to null

         in java we could say the arrays are a collection of the ref variables

         each ref var points to the individual objects




         */


    }

}
