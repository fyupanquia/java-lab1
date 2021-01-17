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
public class Exercise8 {

    /**
     * Given a natural number of 3 digits, design a program that allows obtaining the multiplication of your digits. Thus, if the number 235 is read, the program should show 2 * 3 * 5 = 30.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,c,d,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = s.nextInt();
        c = n/100;
        n = n % 100;
        d = n/10;
        i = n % 10;
        System.out.println(c+" * "+d+" * "+i+" = "+ c*d*i);
    }
    
}
