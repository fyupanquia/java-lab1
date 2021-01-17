/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise1 {

    /**
     * Create a program that allows you to enter a person's first name, last name, age, and weight, then print out all the data entered.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in).useLocale(Locale.ENGLISH);;
        System.out.println("What's your name? ");
        System.out.println("Your name is: "+ s.next());
        
        System.out.println("What's your lastname? ");
        System.out.println("Your lastname is: "+ s.next());
        
        System.out.println("How old are you? ");
        System.out.println("Your are: "+ s.nextInt()+" years old");
        
        System.out.println("How much do you weight (kg)? ");
        System.out.println("You weight: "+ s.nextDouble()+" kg");
        
        
    }
    
}
