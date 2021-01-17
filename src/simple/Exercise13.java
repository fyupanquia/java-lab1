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
public class Exercise13 {

    /**
     * Design a program that reads the capacity of a hard drive in megabytes and converts it to
        gigabytes, kilobytes, and bytes. Consider that: 1 kilobytes = 1024 bytes, 1 megabytes = 1024
        kilobytes, 1 gigabytes = 1024 megabytes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mb,gb,kb,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter megabytes (MB):");
        mb = s.nextDouble();
        gb=mb/1024;
        kb=mb*1024;
        b=kb*1024;
        System.out.println("Megabytes (MB): "+ mb);
        System.out.println("Gigabytes (GB): "+ gb);
        System.out.println("Kilobytes (KB): "+kb);
        System.out.println("Bytes (B): "+b);
    }
    
}
