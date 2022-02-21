package com.codewithSuvro;

public class Array {
    public static void main(String[] args) {
        // arrays in c / c++ the elements or block of memory in case of arrays are stored continuously
        // continuous memory allocation

        // IMP -> there is no concept of pointers in case of java

        // SO IT TOTALLY DEPENDS ON THE JVM THAT THE ARRAY WILL BE CONTINUOUS OR NOT

        // BECAUSE

        // 1] OBJECTS BE IT OF ANY KIND EX - ARRAY OBJECTS ARE STORED IN THE HEAP MEMORY

        // 2] IN THE JLS (JAVA LANGUAGE SPECIFICATION) IT HAS BEEN CLEARLY MENTIONED HEAP OBJECTS ARE NOT CONTINUOUS

        // 3] DYNAMIC MEMORY ALLOCATION HAPPENS AT RUNTIME IE CREATING OBJECTS OF THE REF VARS HAPPEN AT RUNTIME
        // THAT IS KNOWN AS THE DYNAMIC MEMORY ALLOCATION

        // HENCE THESE ARE THE REASONS WHY ARRAY OBJECTS IN JAVA MAY NOT BE CONTINUOUS
        // EVEN THE ARRAY BY DEFINATION IS CONTINUOS
        // IN JAVA INTERNALLY IT IS NOT CONTINUOS
        // because it depends on the jvm


    }
}
