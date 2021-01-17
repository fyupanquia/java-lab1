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
public class Exercise3 {

    /**
     * 8) Design a programme which multiply the three first digits of any number
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,h,t,i;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number:");
        n = s.nextInt();
        h = n/100;
        n = n % 100;
        t = n/10;
        i = n %10;
        System.out.println(h+" * "+t+" * "+i+" = "+ h*t*i);
    }
    
}
