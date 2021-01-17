/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YT;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise4 {

    /**
     * 13) Design a programme which calculates the equivalence of megabytes in gigabytes, kilobytes and bytes 
     * 1 kilobytes = 1024 bytes, 1 megabytes = 1024 kilobytes, 1 gigabytes = 1024 megabytes
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double mb,gb,kb,b;
        Scanner s = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Enter megabytes mb: ");
        mb = s.nextDouble();
        gb = mb/1024;
        kb=mb*1024;
        b=kb*1024;
        System.out.println("Megabytes (mb): "+mb);
        System.out.println("Gigabytes (gb): "+gb);
        System.out.println("Kilobytes (kb): "+kb);
        System.out.println("Bytes (b): "+b);
    }
    
}
