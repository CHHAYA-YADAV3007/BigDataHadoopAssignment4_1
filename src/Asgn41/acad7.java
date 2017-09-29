/**
 * acad7.java 1.1
 * 
 * Compiled on 29th September 2017
 */

//package declaration

package Asgn41;

//importing the package to use Scanner class

import java.util.Scanner;
/**
 * This class illustrates the method overloading concept of java.
 * This class indicates that we can overload the method with same return type.
 * In this class the return type is integer for all the definitions of method of same name.
 * 
 * 
 * version 1.1
 * 
 * Compiled on 29th September,2017
 * 
 * @author chhaya yadav
 *
 */

//public class declaration

public class acad7 {

//instance variable declaration
	
	int a , b , c  ;
	
//default constructor declaration
	
	public acad7(){
		
		a = 0 ;
		
		b = 0 ;
		
		c = 0 ;
	}
	
//method declaration with no arguments to take user input and display their sum
	
	public int sum(){
		
//Scanner class instantiation and initialization
		
		Scanner sc = new Scanner(System.in);
		
//Taking user input from stdin to calculate their sum at runtime		
		
		System.out.println("Enter first integer ");
		
		a = sc.nextInt();
		
		System.out.println("Enter second integer ");
		
		
		b = sc.nextInt();
		
//closing the Scanner class instance
		
		sc.close();
		
		int add = a + b ;
		
		return add ;
		



	}
	
//method declaration with two arguments to display their sum
	
	public int sum(int a ,int b){
		
		this.a = a ;
		
		this.b = b ;
		
	    int add  = a  + b ;
	    
	    return add ;
				
	}
	
	
//method declaration with three arguments to display their sum
	
	public int sum(int a ,int b , int c){
		
		this.a = a ;
		
		this.b = b ;
		
		this.c = c ;
		
	    int add  = a  + b + c  ;
	    
        return add ;
				
	}
	
	public static void display(int addition){
		
		 System.out.println( "Addition : " + addition) ;
			
		 System.out.println("*****************************************************");
		
	}
	
	public static void main(String[] args){
		
	 int addition ;
		
	 System.out.println("This JAVA program will prove that method overloading can be achieved with same return type.");
	 
	 System.out.println("All the method definitions of sum function will return the same return type.");
//class object instantiation 		
		
	 acad7 a1 = new acad7();
	 
//invoking the sum method with no arguments	 
	 
	 addition = a1.sum();
	 
//invoking the method to display the sum 	 
	 
     display(addition);
     
//class object instantiation      
	 
	 acad7 a2 = new acad7();
	 
//invoking the sum method with two arguments	 
	 
	 addition = a2.sum( 10, 20) ;
	 
//invoking the method to display the sum	 
	 
	 display(addition);
	 
//class object instantiation 	 
	 
	 acad7 a3 = new acad7();
	 
//invoking the sum method with three arguments	 
	 
	 addition = a3.sum( 10, 20, 30) ;
	 
//invoking the method to display the sum	 
	 
	 display(addition);
		
	}

}

