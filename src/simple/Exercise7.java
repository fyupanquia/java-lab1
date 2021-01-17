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
public class Exercise7 {

    /**
     * Build a program that calculates the amount that a customer who buys will pay in each installment a sound equipment on credit, knowing that each installment is increased by 5% interest.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price,odue, interest;
        int dues;
        Scanner s = new Scanner(System.in);
        System.out.println("How much does it cost? ");
        price = s.nextDouble();
        System.out.println("How many duesdo you want? ");
        dues = s.nextInt();
        odue= price/dues;
        System.out.println("odue = "+ odue);
        for (int i = 1; i <= dues; i++) {
            System.out.println("Interest "+(i)+") ="+ price*0.05*i );
            System.out.println("Due "+(i)+") ="+(odue+ price*0.05*i) );
        }
        
    }
    
}
