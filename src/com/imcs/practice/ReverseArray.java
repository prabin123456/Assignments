package com.imcs.practice;

/**
 *
 * @author basta
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {4, 5 , 6, 7, 8};
        reverse(a, a.length);
    }

    public static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }


        System.out.print("Reversed array :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }
    }

}