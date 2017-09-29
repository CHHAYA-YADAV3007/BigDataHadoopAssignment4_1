/**
 * acad5.java  1.1
 * 
 * Compiled on 29th September ,2017
 */
//package declaration
package Asgn41;

//importing the package 

import java.util.Scanner ;
/**
 * This class illustrates a program to find the “first 10 multiples” of the number entered from stdin.
 * 
 * version 1.1
 * 
 * Compiled on 29th Sept 2017
 * 
 * @author chhaya yadav
 *
 */

//public class declaration

public class acad5 {

//main method declaration
	
	public static void main(String[] args) {

//invoking the static method sum for printing first ten multiples of user input from stdin
		
	findMultiples();
		
	}
	
//sum method declaration	
	public static void findMultiples(){
		
//integer variable declaration
		
		int a ;
		
// Object instantiation of Scanner class in order to take user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer :");
		
//taking user input for first integer from command prompt at runtime
		
		a  = sc.nextInt();
		
		
//Printing the integer that has been received from stdin in above step
		
		
		System.out.println("Input : " + a);
		
//Display the ,multiples of user input integer
		
		System.out.println("O/p : ");

//Determining the first ten multiples of user input integer	
		
		for ( int i = 1 ; i < 11 ; i ++){
			
		
			  
			  System.out.println( a + " * " + i + " = " + (a * i ));
		 }
		 	
		
		
	
//Closing the Scanner class instance
		
		
		sc.close();

	}

}
