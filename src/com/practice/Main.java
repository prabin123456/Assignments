/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;

/**
 *
 * @author basta
 */
public class Main {

    public static void main(String[] args) {

        Person student = new Employee("Dove", "Female", 0);
        Person employee = new Employee("Pankaj", "Male", 123);
        student.work();
        employee.work();
        //using method implemented in abstract class - inheritance
        employee.changeName("Pankaj Kumar");
        System.out.println(employee.toString());
    }

}
