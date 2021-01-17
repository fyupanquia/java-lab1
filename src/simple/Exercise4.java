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
public class Exercise4 {

    /**
     * Develop a program to calculate the percentage of men and women who find in the classroom
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int girls,boys, total;
        Scanner s = new Scanner(System.in);
        System.out.println("How many girls? ");
        girls = s.nextInt();
        System.out.println("How many boys? ");
        boys = s.nextInt();
        total= girls+boys;
        
        System.out.println("Girls: "+ ((double)girls/(double)total)*100 +"%");
        System.out.println("Boys: "+ ((double)boys/(double)total)*100 +"%");
    }
    
}
