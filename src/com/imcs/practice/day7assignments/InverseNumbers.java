package com.imcs.practice.day7assignments;

import java.util.Scanner;

/**
 *
 * @author basta
 */
public class InverseNumbers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        inverseNumbers(arr);

    }

    public static void inverseNumbers(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            
        }
        System.out.println(arr);
    }

}
