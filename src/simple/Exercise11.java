/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise11 {

    /**
     * 
        Given the capacity of a container in gallons, design a program that expresses this
        capacity in its equivalent to liters, cubic meters and cubic feet. Consider the
        equivalences: 1 cubic foot = 0.0283 cubic meters, 1 cubic meter = 1000 liters, 1 gallon =
        3.79 liters.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons, liters,mcubic, fcubic;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter quantity of Gallons:");
        gallons = s.nextDouble();
        
        liters=gallons*3.79;
        mcubic=liters/1000;
        fcubic=mcubic/0.0283;
        
        System.out.println("Gallons: "+gallons);
        System.out.println("Liters: "+liters);
        System.out.println("Cubic meters: "+mcubic);
        System.out.println("Foot meters: "+fcubic);
        
    }
    
}
