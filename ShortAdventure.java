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
public class ShortAdventure 
{
    public static void main(String[] args){
        //variable declaration and creation of Scanner object
        String choice;
        Scanner input = new Scanner(System.in);
        
        //prompt and user input.
        System.out.println("WELCOME TO EDWIN'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
"\"kitchen\"?");
        choice = input.next();
        if (choice == "kitchen"){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
"there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
"or look in a \"cabinet\".");
            choice = input.next();
        }
        
       
       
        
    if (choice == "refrigerator"){
            System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
"Would you like to eat some of the food? (\"yes\" or \"no\")");
             choice = input.next();
        
        
    }
     if (choice == "no"){
                 System.out.println("You die of starvation...eventually");
             }
    }   
}

}
