package com.imcs.practice;

import java.util.Scanner;

/**
 *
 * @author basta
 */
public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum1=0;
        String s1 = Integer.toString(s);
        int b = s1.length();
        char[] ch = s1.toCharArray();

        int[] arr1 = new int[b];

        for (int i = 0; i < ch.length; i++) {
            arr1[i] = (int) ch[i] - 48;
            sum1 += (int) Math.pow(arr1[i], b);

        }
        System.out.println(sum1);
        if (s == sum1){
            System.out.println("it is a armstrong number");
        }
        else
            System.out.println("it is not an armstrong number");


    }
}
