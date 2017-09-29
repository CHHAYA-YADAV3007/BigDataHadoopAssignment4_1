/**
 * acad4.java  1.1
 * 
 * Compiled on 29th September ,2017
 */
//package declaration
package Asgn41;

//importing the package 

import java.util.Scanner ;
/**
 * This class illustrates a program to accepts two numbers from stdin and find all the odd as well as even
 * numbers present in between them.
 * 
 * version 1.1
 * 
 * Compiled on 29th Sept 2017
 * 
 * @author chhaya yadav
 *
 */

//public class declaration

public class acad4 {

//main method declaration
	
	public static void main(String[] args) {

//invoking the static method sum for printing the even and odd number in between two integers
		
	findEvenOdd();
		
	}
	
//sum method declaration	
	public static void findEvenOdd(){
		
//integer variable declaration
		
		int a , b, i;
		
// Object instantiation of Scanner class in order to take user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer :");
		
//taking user input for first integer from command prompt at runtime
		
		a  = sc.nextInt();
		
	    System.out.println("Enter second integer :");
	    
//taking user input for second integer from command prompt at runtime	    
		
		b  = sc.nextInt();
		
//Printing the first and second integers as lower  limit and upper limit
		
		System.out.println("First Number is: " + a);
		
		System.out.println("Second Number is : " + b);
		
		System.out.println("Even Numbers are mentioned below :");

//Determining the Even numbers in between lower limit and upper limit		
		
		for ( i = a+1 ; i < b ; i ++)
			
		{
			
//Even number logic is being displayed below
			
		  if(i%2 == 0){
			  
			  System.out.println( i );
		  }
		 	
		}
		
		System.out.println("Odd Numbers are mentioned below :");

//Determining the Odd numbers in between lower limit and upper limit		
		
		for (i = a+1 ; i < b ; i ++)
			
		{

//Odd number logic is being displayed below
						
		  if(i%2 != 0){
			  
			  System.out.println( i );
		  }
		 	
		}
//Closing the Scanner class instance
		
		
		sc.close();

	}

}
