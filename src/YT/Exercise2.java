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
public class Exercise2 {

    /**
     * 7) Design a program which calculates each installments that a client have to pay for a stereo. Each installment increments 5% of interest
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price, installment_mont,interest;
        int installments;
        interest = 0.05;
        Scanner s = new Scanner(System.in);
        System.out.println("How much does the stereo cost?");
        price = s.nextDouble();
        
        System.out.println("How many installments do you need?");
        installments = s.nextInt();
        
        installment_mont = price/installments;
        System.out.println(installment_mont);
        
        for (int i = 1; i <= installments; i++) {
            System.out.println("*****");
            System.out.println("Interest "+i+" = "+ price*interest*i);
            System.out.println("Installment "+i+" = "+ (installment_mont+price*interest*i));
            System.out.println("*****");
        }
        
    }
    
}
