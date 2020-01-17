package com.imcs.practice;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(HCF(4, 2));
        System.out.println(LCM(4, 2));

    }

    public static int HCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int LCM(int a, int b){
        return (a*b)/HCF(a,b);
    }

}