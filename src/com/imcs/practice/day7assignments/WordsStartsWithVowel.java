package com.imcs.practice.day7assignments;

import java.util.Scanner;

/**
 *
 * @author basta
 */
public class WordsStartsWithVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        for (String s1 : words) {
            s1 = s1.toLowerCase();
            char ch = s1.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(s1);
            } 
            
            
        }

    }

}
