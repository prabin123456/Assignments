/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.lamdaexpression;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author basta
 */
public class PLStartWithG {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("cpp");
        list.add("java");
        list.add("gova");
        list.add("go");
        list.add(".net");
        list.add("python");

        Predicate<String> startsWithG = (p) -> p.startsWith("g");
        Predicate<String> morethanThree = n -> n.length() > 3;

        list.stream().filter(startsWithG).forEach(prabin -> System.out.println(prabin));
        list.stream().filter(morethanThree).forEach(prabin -> System.out.println(prabin));

    }

}
