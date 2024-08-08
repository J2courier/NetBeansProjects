/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j1;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class J1 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);  //declare a scanner variable
         
         /*example of inputing a string data type
         System.out.println("May I know your name? ");//display a question
         String name = input.nextLine(); //the answer is being stored here  
         System.out.println("have a good day!" + name);//reply
         //NOTE: nextLine(); for string
         
         
         
         //example of inputing a integer data type
         System.out.println("How old are you this year? ");//ask question
         int userAge = input.nextInt();//storing your answer
         System.out.println("I see so youre turning " + userAge + " this year!");//reply
         input.nextLine();
         System.out.println("how are your? ");
         String ans = input.nextLine();
         
        //expression = operands and operators   
        float friend = 10;
        friend = friend / 3;
        System.out.println(friend); */
         
         String name = JOptionPane.showInputDialog("Enter code:"); //this one is equivalent to System.out.print(); 
         JOptionPane.showMessageDialog(null, "Welcome "+ name);//showMessageDialog is how to show a reply
         int age = Integer.parseInt(JOptionPane.showInputDialog("How Old Are YOU? "));//when asking for an int data type
         // we will use Integer.parseInt
         JOptionPane.showMessageDialog(null,"what? You are so old!");
         
         //math method below:
         //Math.min/max gets the minimum and maximum value of the variables.
         //Math.abs gets the positive value of negative number (abs is ABSOLUTE)
         //Math.sqrt gets the sqaure root of a variable
         //Math.round it rounds off the variable
         //Math.ceil always round up the variable
         //Math.floor always round down the variable
         
         
         //getting the hypotenuse of a triangle
         double a, b, c; //initialization is the same in other languages
         
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter the length of a: ");
         a = scn.nextDouble();
         System.out.println("Enter the length of b: ");
         b = scn.nextDouble();
         c = Math.sqrt((a * a) + (b * b));//write the formula and use the math method to get the square root
         
         System.out.println("the hypotenuse of the triangle is " + c + ".");
         scn.close();
         
         
    }
}
