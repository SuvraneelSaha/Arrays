package com.codewithSuvro;

// Topic --
// Syntax
// Datatype
// datatype of the arrays


public class Intro_One {
    public static void main(String[] args) {
        // syntax of arrays :
        // datatype[] variable_name = new datatype[size]; // this is the actual syntax
        // data type can be of int char depending on the user
        // variable name can be anything according to the user
        // size is the no. of required elements or datas

        // ex -

        int[] roll = new int[5];

        // or by hard coded

        int[] roll_nos = {1,2,3,4,5};


        // IMP points --
        //   1]   this data int -- > it represents the type of data that is stored inside the array

        // 2] the data all should be same

        // int[] Roll = {1,3, "kunal", "o", 1 };
        // this will give an error cause all the datatypes are not the same

        // 3 ]
        // if you are making int array then it will contain integers only
        // if you are making String array then it will contain Strings only

        // 4 ] int[] roll = new int[5] -- > this int[] means roll is a reference variable
        // that is pointing to an array object that contains type integer elements




    }
}
