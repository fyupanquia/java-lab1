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
public class Exercise10 {

    /**
     * 
        A hospital has received a special donation that will be distributed as follows: 45%
        for General Medicine, 30% for Cardiology, 15% for Pediatrics and the rest for
        Traumatology. Design a schedule that determines how much each area will receive
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dolars;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter donation ($): ");
        dolars = s.nextDouble();
        
        System.out.println("General medicine: "+ dolars*0.45);
        System.out.println("Cardiology: "+dolars*0.3);
        System.out.println("Pediatrics: "+dolars*0.15);
        System.out.println("Traumatology: "+dolars*0.1);
    }
    
}
