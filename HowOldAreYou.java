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
public class HowOldAreYou 
{
    public static void main(String[] args)
    {
        
        String name; 
        int age;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? ");
        name = input.nextLine();
        
        System.out.print("\nOk, "+name+", how old are you? ");
        age = input.nextInt();
       
        if (age<16)
        {
            System.out.println("\nYou can't drive "+name+".");
        }
        if (age<18)
        {
            System.out.println("You can't vote "+name+".");
        }
        if (age<25)
        {
            System.out.println("You can't rent a car "+name+".");
        }
        if(age==25||age>25)
        {
            System.out.println("You can do anything that's legal "+name);
        }
    }
}
