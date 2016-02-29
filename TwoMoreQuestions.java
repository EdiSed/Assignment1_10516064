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
public class TwoMoreQuestions
{
     public static void main(String[] args){
        //variable declaration and scanner object creation 
        String belong; //for inside, outside, both
        String alive;//is it alive?Yes or no
        Scanner input = new Scanner (System.in);
        
        //prompts and user inputs
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        belong = input.next();
        System.out.println();
        System.out.print("Question 2) Is it a living thing? ");
        alive = input.next();
        
        //computation
        if (belong == "outside" && alive == "no"){
           
                System.out.println("My guess is that you are thinking of a billboard");
               
            
            
        }
        if (belong == "outside" && alive == "yes"){
            
                System.out.println("My guess is that you are thinking of a python");
             
                
            
            
        }
       if (belong == "inside" && alive == "no"){
           
                System.out.println("My guess is that you are thinking of a shower curtains");
                
                
            
            
        }
       if (belong == "inside" && alive == "yes"){
            
                System.out.println("My guess is that you are thinking of a ant");
                
                
            
            if (belong == "both" && alive == "no"){
            
                System.out.println("My guess is that you are thinking of dead ant");
               
                
            
            if (belong == "both" && alive == "yes"){
            
                System.out.println("My guess is that you are thinking of a cockroach");
                
                
            }
            
        }
            
        }
        
    }
}
