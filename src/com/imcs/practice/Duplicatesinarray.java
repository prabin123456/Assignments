package com.imcs.practice;
import java.util.Arrays;

/**
 *
 * @author basta
 */
public class Duplicatesinarray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5, 1, 2, 3};
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[j] = arr1[n - 1];
                    n--;
                    j--;

                }
            }
        }

        int arr2[] = Arrays.copyOf(arr1, n);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }



    }

}