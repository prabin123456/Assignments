/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.whatsappassignments;

import java.util.Comparator;

/**
 *
 * @author basta
 */
public class SortByName implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
    }
    
}
