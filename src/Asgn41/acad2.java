/**
 * acad2.java  1.1
 * 
 * Compiled on 29th September ,2017
 */
//package declaration
package Asgn41;

//importing the package 

import java.util.Scanner ;
/**
 * This class illustrate the sum of two integers when two integers are being taken as user input at runtime
 * 
 * version 1.1
 * 
 * Compiled on 29th Sept 2017
 * 
 * @author chhaya yadav
 *
 */

//public class declaration

public class acad2 {

//main method declaration
	
	public static void main(String[] args) {
		
//integer variable declaration
		
		int a , b, sum ;
		
// Object instantiation of Scanner class in order to take user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer :");
		
//taking user input for first integer from command prompt at runtime
		
		a  = sc.nextInt();
		
	    System.out.println("Enter second integer :");
	    
//taking user input for second integer from command prompt at runtime	    
		
		b  = sc.nextInt();
		
//Addition of two integers that have been  received at runtime
		
		sum = a + b ;
		
		System.out.println("Sum of "+ a + " and "+ b + "  is :" + sum);
		
//Closing the Scanner class instance
		
		sc.close();

	}

}
