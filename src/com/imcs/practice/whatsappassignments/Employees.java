/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.practice.whatsappassignments;

/**
 *
 * @author basta
 */
public class Employees {

    private int empId;
    private String firstName;
    private String lastName;
    private final long SSN;

    public Employees(int empId, String firstName, String lastName, long SSN) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getSSN() {
        return SSN;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
