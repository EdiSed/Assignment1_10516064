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
public class Assignment1_10516064 
{
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height;
		double weight;
                int inches;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.nextInt();
                
                System.out.print("How many inches?");
                inches = keyboard.nextInt();
                        
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + "\'" + inches + "\""  + " tall and " + weight + " heavy." );
	}
}

    
    
    

