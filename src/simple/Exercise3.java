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
public class Exercise3 {

    /**
     * Write program to enter 3 grades from a student, calculate and display their average, knowing that the third note has double weight
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double n1,n2,n3,average;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first grade:");
        n1=s.nextDouble();
        System.out.println("Enter the second grade:");
        n2=s.nextDouble();
        System.out.println("Enter the third grade:");
        n3=s.nextDouble();
        average=(n1+n2+n3*2)/4;
        System.out.println("The average is:"+average);        
        
    }
    
}
