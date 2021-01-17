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
public class Exercise6 {

    /**
     * Given a natural number of 4 digits, design a program that allows the output to be displayed number backwards. For example: input = 2345 and output = 5432
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,a,b,c,d, nr;
        String nn, aux="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number of 4 digits:");
        n = s.nextInt();
        
        // short way
        nn = n+"";
        for (int x=nn.length()-1;x>=0;x--)
          aux = aux + nn.charAt(x);
        System.out.println("Result A):"+ aux);
        
        //long way
        a=n/1000;
        n=n%1000;
        b=n/100;
        n=n%100;
        c=n/10;
        d=n%10;
        nr= d*1000+c*100+b*10+a;
        System.out.println("Result B):"+ nr);
       
    }
    
}
