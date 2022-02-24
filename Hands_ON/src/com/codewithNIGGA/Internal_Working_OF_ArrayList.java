package com.codewithNIGGA;

public class Internal_Working_OF_ArrayList {
    public static void main(String[] args) {
        // size is fixed internally

        //  say the array list we are using fills up by some amount like 50%
        // then what happens is that
        //it will create a new arraylist of say double the amount that of the previous one
        //and the old elements will be copied in the new list
        // and the old one is deleted

        // ArrayList<Integer> list = new ArrayList<>(5);
        // when the array list is filled almost 50 % it will create another list double the size and
        // will copy the contents of the previous elements and will store it in the new list


        // the increase is dependent on the jvm how the size of the array list increases
        // is dependent on the java virtual machine


    }
}
