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
public class AgeInFiveYears 
{
    public static void main(String[] args) 
    {
        String name;
        int age;
      Scanner Edi=new Scanner(System.in);
    
    
    System.out.print("Hello. What is your name? ");
    name = Edi.nextLine();
    
    System.out.print("\nHi, "+name+"! How old are you? ");
    age = Edi.nextInt();
    
    System.out.println("\nDid you know that in five years you will be "
                       +(age+5)+" years old?");
    
    System.out.println("And five years ago you were "+(age-5)+"! Imagine that!");  
    }
    
}
