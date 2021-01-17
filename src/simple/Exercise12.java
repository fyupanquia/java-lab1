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
public class Exercise12 {

    /**
     * A dairy company exports its total production as follows: 35
        % for Asia, 27% for Europe, 19% for Latin America and the rest for Africa. Design a
        program that determines how much is exported to each place.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double liters;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Liters:");
        liters = s.nextDouble();
        
        System.out.println("Asia: "+liters*0.35+" liters");
        System.out.println("Europa: "+liters*0.27+" liters");
        System.out.println("America: "+liters*0.19+" liters");
        System.out.println("Africa: "+liters*0.19+" liters");
        
    }
    
}
