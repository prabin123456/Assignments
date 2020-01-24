/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.lamdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author basta
 */
public class PLEndWithA {

    public static void main(String[] args) {
        List<String> pl = new ArrayList<>();
        pl.add("java");
        pl.add("c");
        pl.add("cpp");
        pl.add("python");
        pl.add(".net");
        pl.add("gova");
        pl.add("go");

        pl.forEach((language) -> {
            if (language.endsWith("a")) {
                System.out.println(language);
            }
        });
        
        System.out.println("====================");
        
        pl.forEach((language) -> {
            if (language.endsWith("va")) {
                System.out.println(language);
            }
        });

    }

}
