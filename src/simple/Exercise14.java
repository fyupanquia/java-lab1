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
public class Exercise14 {

    /**
     * 
        A veterinarian attends a number of dogs, cats and birds, you want to know the percentage of
        dogs, cats and birds represented by each of the quantities
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dogs,cats,birds,animals;
        double adogs,acats,abirds;
        Scanner s = new Scanner(System.in);
        System.out.println("How many dogs?:");
        dogs=s.nextInt();
        System.out.println("How many cats?:");
        cats=s.nextInt();
        System.out.println("How many birds?:");
        birds=s.nextInt();
        animals = dogs+cats+birds;
        
        adogs = ((double)dogs/(double)animals)*100;
        acats = ((double)cats/(double)animals)*100;
        abirds = ((double)birds/(double)animals)*100;
        
        System.out.println("ANIMALS :"+animals); 
        System.out.println("DOGS:"+adogs+"%"); 
        System.out.println("CATS:"+acats+"%"); 
        System.out.println("BIRDS:"+abirds+"%"); 
        
    }
    
}
