/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.day7assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author basta
 */
public class SortInNatural {

    public static void main(String[] args) {
        sortString("hello i am a don");
    }
//     public static void sortString(String[] word){
//        String naya = word.replace(" ", "");
//        List<String> st = new ArrayList<String>();
//        for(: word){
//            st.add(word[i]);
//        }
//        st.get(0);
//        System.out.println(st.get(1));
//        char[] startsort = naya.toCharArray();
//        for(int i = 0; i < startsort.length; i++){
//            System.out.println(startsort[i]);
//         public static void sortString(String word){

    public static void sortString(String word) {

        char[] startsort = word.toCharArray();
        Arrays.sort(startsort);
        Arrays.sort(startsort);
        String sortedword = new String(startsort);
        System.out.println(sortedword);

    }
//        }
//        Arrays.sort(startsort);
//        System.out.println(startsort);
//        
//        String sortedword = null;
//        System.out.println(new String(startsort));
}
