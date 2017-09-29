/**
 * acad6.java 1.1
 * 
 * Compiled on 29th September 2017
 */

//package declaration

package Asgn41;

//importing the package to use Scanner class

import java.util.Scanner;
/**
 * This class illustrates the method overloading concept of java.
 * 
 * version 1.1
 * 
 * Compiled on 29th September,2017
 * 
 * @author chhaya yadav
 *
 */

//public class declaration

public class acad6 {

//instance variable declaration
	
	int a , b , c  ;
	
//default constructor declaration
	
	public acad6(){
		
		a = 0 ;
		
		b = 0 ;
		
		c = 0 ;
	}
	
//method declaration with no arguments to take user input and display their sum
	
	public void sum(){
		
//Scanner class instantiation and initialization
		
		Scanner sc = new Scanner(System.in);
		
//Taking user input from stdin to calculate their sum at runtime		
		
		System.out.println("Enter first integer ");
		
		a = sc.nextInt();
		
		System.out.println("Enter second integer ");
		
		
		b = sc.nextInt();
		
		int add = a + b ;
		
		System.out.println( "Sum of "+ a + " and "+ b + " is :" + add) ;
		
		System.out.println("*****************************************************");

//closing the Scanner class instance
		
		sc.close();
	}
	
//method declaration with two arguments to display their sum
	
	public void sum(int a ,int b){
		
		this.a = a ;
		
		this.b = b ;
		
	    int add  = a  + b ;
	    
	    System.out.println( "Sum of "+ a + " and "+ b + " is :" + add) ;
	    
		System.out.println("*****************************************************");
				
	}
	
	
//method declaration with three arguments to display their sum
	
	public void sum(int a ,int b , int c){
		
		this.a = a ;
		
		this.b = b ;
		
		this.c = c ;
		
	    int add  = a  + b + c  ;
	    
	    System.out.println( "Sum of "+ a + " and "+ b + " and " + c + " is :" + add) ;
	    
		System.out.println("*****************************************************");
	    		
				
	}
	
	public static void main(String[] args){
		
//class object instantiation 		
		
	 acad6 a1 = new acad6();
	 
//invoking the sum method with no arguments	 
	 
	 a1.sum();
	 
	 acad6 a2 = new acad6();
	 
//invoking the sum method with two arguments	 
	 
	 a2.sum( 10, 20) ;
	 
	 acad6 a3 = new acad6();
	 
//invoking the sum method with three arguments	 
	 
	 a3.sum( 10, 20, 30) ;
		
	}

}
