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
public class Exercise5 {

    /**
     * 15) Design a programme which calculates the addition of the first digit and the last digit of a number
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String number;
        int first, last;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number please: ");
        number = s.next();
        first = Integer.parseInt( Character.toString(  number.charAt(0)   )   );
        last = Integer.parseInt( Character.toString(  number.charAt( number.length()-1 )   )   );
        
        System.out.println(first+" + "+ last+" = "+ (first+last) );
    }
    
}
