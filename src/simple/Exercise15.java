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
public class Exercise15 {

    /**
     * 
        Given a natural number of 5 digits, design a program that allows adding the first and the
        last digit. For example: 23456 the sum must be 2 + 6 = 8.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String number;
        int first, last, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number of 5 digits:");
        number = s.next();
        first = Integer.parseInt(Character.toString(number.charAt(0)));
        last = Integer.parseInt(Character.toString(number.charAt(4)));
        sum = first+last;
        System.out.println(first+" + "+last+" = "+sum );
    }
    
}
