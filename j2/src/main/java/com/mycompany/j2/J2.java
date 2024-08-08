/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j2;

/**
 *
 * @author ADMIN j2courier
 */



import java.util.Scanner;//import scanner for the user to be able to input
public class J2 {

    public static void main(String[] args) {
        //1. initialization and declaration
        Scanner scn = new Scanner(System.in);
        String fName;
        int yLevel, age;
        //2. write the program
        System.out.println("Full Name:");
        System.out.println("Year Level: ");
        System.out.println("Age: ");
        fName = scn.nextLine();
        yLevel = scn.nextInt();
        //scn.nextLine();
        age = scn.nextInt();
        
        System.out.println("Full Name: "+fName);
        System.out.println("Year Level: "+yLevel);
        System.out.println("Age: "+age);
        
        scn.close();
    }
}
