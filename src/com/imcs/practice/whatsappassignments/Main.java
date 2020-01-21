package com.imcs.practice.whatsappassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author basta
 */
public class Main {

    public static void main(String[] args) {
        Employees e = new Employees(1, "Danny", "Ortiz", 1234567);
        Employees e1 = new Employees(2, "Michael", "Ortiz", 1234567);
        Employees e2 = new Employees(3, "Aan", "boy", 1234567);
        List<Employees> employee = new ArrayList();
        employee.add(e);
        employee.add(e1);
        employee.add(e2);
        for (Employees emp : employee) {
            System.out.println(emp.getFirstName());
        }
        Collections.sort(employee, new SortByName());
        System.out.println("================");
        for (Employees emp : employee) {
            System.out.println(emp.getFirstName());
        }

    }

}
