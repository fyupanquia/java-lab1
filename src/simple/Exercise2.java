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
public class Exercise2 {

    /**
     * DDesign a program that calculates the area of ​​a circle. Formule: A = πr².
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        Scanner s = new Scanner(System.in);
        System.out.println("How long is the radio (m)? ");
        radio = s.nextDouble();
        
        System.out.println("Circle area: "+ Math.PI*Math.pow(radio, 2)+" m^2 " );
    }
    
}
