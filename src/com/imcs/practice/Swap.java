package com.imcs.practice;

public class Main {

    public static void main(String[] args) {
        swap(4,2);

    }
    public static void swap(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("a = " + a + " b = "+b);
    }
}
