/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise9 {

    /**
     * Design a program that interchanges the figures of the units of two whole numbers that
        they can have different amounts of figures. For example: the number 1 = 785 and the number 2 =49 which when exchanging will be number 1 = 789 and number 2 = 45
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r, last;
        String n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1 = Integer.toString(s.nextInt());
        System.out.println("Enter the second number: ");
        n2 = Integer.toString(s.nextInt());
        Random rn = new Random();
        last = Integer.parseInt(Character.toString(n1.charAt(n1.length()-1)));
        r = rn.nextInt(10 - 1 + 1) + 1;
       
        n1 = n1.substring(0,n1.length()-1) + ((last==r) ? (r-1) : r);

        last = Integer.parseInt(Character.toString(n2.charAt(n2.length()-1)));
        r = rn.nextInt(10 - 1 + 1) + 1;
        
        n2 = n2.substring(0,n2.length()-1) + ((last==r) ? (r-1) : r);
        
        System.out.println("The first number now is: "+n1);
        System.out.println("The second number now is: "+n2);
    }
    
}
