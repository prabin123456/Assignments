/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.day7assignments;

/**
 *
 * @author basta
 */
public class ReplaceVowels {

    public static void main(String[] args) {
        replaceVowels("My quick brown fox jumps over a ditch");

    }

    public static void replaceVowels(String s1) {
        String s = s1.toLowerCase();
        char[] ch = s.toCharArray();
        
        System.out.println(ch);
        

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ch[i] = 'a';
            }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
