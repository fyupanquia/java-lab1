/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YT;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise1 {

    /**
     * 2) Design a program that calculates the area of a circle.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        Scanner s = new Scanner(System.in);
        System.out.println("How long the radio is (m) ?");
        radio = s.nextDouble();
        System.out.println("Area:"+ Math.PI*Math.pow(radio, 2)+" m²");
    }
    
}
