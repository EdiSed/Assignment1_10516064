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
public class MoreUserInputOfData 

{
    public static void main(String[] args) 
    {
        String Fname;
        String Lname;
        int grade;
        int sID;
        String login;
        double GPA ;
        
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the following information so i can sell it for a profit!");
        
        System.out.println("First name:");
        Fname = keyboard.nextLine();
        
        System.out.println("Last name:");
        Lname = keyboard.nextLine();
        
        System.out.println("Grade (9-12):");
        grade = keyboard.nextInt();
        
        System.out.println("Student ID:");
        sID = keyboard.nextInt();
        
        System.out.println("Login:");
        login = keyboard.nextLine();
        
        System.out.println("GPA(0.0-4.0):");
        GPA = keyboard.nextDouble();
        
        System.out.println("Your information: ");
        System.out.println("\tLogin: "+ login);
        System.out.println("\tID: "+ sID);
        System.out.println("\tName: "+ Lname+" , "+Fname);
        System.out.println("\tGPA: "+ GPA);
        System.out.println("\tGrade: "+ grade);
    }

        
        
}
 

