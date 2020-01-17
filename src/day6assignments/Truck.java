/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6assignments;

/**
 *
 * @author basta
 */
public class Truck implements Vehicle {

    @Override
    public int maxSpeed() {
        return 220;
        
    }

    @Override
    public String transmission() {
        return "Truck Automatic transmission";
    }
    
}
