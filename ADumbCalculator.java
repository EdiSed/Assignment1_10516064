/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10516064;

import java.util.Scanner;

/**
 *
 * @author edinamsedo
 */
public class ADumbCalculator 
{
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double num3;
        Scanner dumb = new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        num1 = dumb.nextDouble();
        
        System.out.print("What is your second number? ");
        num2 = dumb.nextDouble();
       
        System.out.print("What is your third number? ");
        num3 = dumb.nextDouble();
        
        System.out.println("( "+num1+" + "+num2+" + " +num3+" ) / "+2
                        +" is... "+(num1+num2+num3)/2);
    
    }
}
