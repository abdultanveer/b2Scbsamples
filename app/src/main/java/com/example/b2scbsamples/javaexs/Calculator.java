package com.example.b2scbsamples.javaexs;


public class Calculator {

    public static int add(int a, int b){

        int j = 10;//int is a primitive datatype
       // j.add(20)
        Integer k = 20;
        k.compareTo(20);
        k = j; //boxing -- primitive datatype to a object
        int x = k.intValue(); //unboxing -- converting an object to primitive datatype
        return  a + b;
    }
}
