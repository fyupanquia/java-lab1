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
public class Exercise5 {

    /**
     * calculate a measurement given in meters to its equivalent in: centimeters, kilometers, inches. Knowing that: 1000 m = 1 km, 100 cm = 1 m, 2.54 cm = 1 inch.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double meters,c,km,inch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter meters:");
        meters=s.nextDouble();
        
        c=meters*100;
        km=meters/1000;
        inch=c/2.54;
        
        System.out.println("Centimeters:"+c);
        System.out.println("Kilometers:"+km);
        System.out.println("Inches:"+inch);
    }
    
}
