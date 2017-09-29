/**
 * acad8.java 1.1
 * 
 * Compiled on 29th September 2017
 */
//package declaration
package Asgn41;
/**
 * This class illustrate the sorting operation in descending order on integer array and character array.
 * 
 * version 1.1
 * 
 * Compiled on 29th September 2017
 * 
 * @author chhaya yadav
 *
 */
//public class declaration

public class acad8 {

//main method declaration
	
	public static void main(String[] args) {
	
//Integer array declaration,instantiation and initialization
		
		int[] intArray = new int[]{45,67,13,20,50,98,41,56,71};
		
//Sorting algorithm for Integer array in descending order
		
		for(int j = 0; j < intArray.length ; j ++){
			
			for(int k = 1 ; k < intArray.length ; k++){
					
			    if(intArray[k-1] < intArray[k]){
			     
				    int temp = intArray[k] ;
				    
				    intArray[k] = intArray[k-1];
				    
				    intArray[k-1] = temp ;
				
			     }
			    
		    }
		}

//Display the sorted array in descending order		
		
		System.out.println("Sorted Integer Array in Descending order ");
		
		for(int i = 0 ; i < intArray.length; i++) {
			
		System.out.println(intArray[i]);
		}
		
		

//Character Array declaration, Instantiation and initialization
		
		char[] charArray = new char[]{'A','C','U','I','D','K','E','Z','L','P','S'} ;
		
//Sorting algorithm for character array in descending order		
		
	    for(int j = 0; j < charArray.length ; j ++){
			
			for(int k = 1 ; k < charArray.length ; k++){
					
			    if(charArray[k-1] < charArray[k]){
			     
				    char temp = charArray[k] ;
				    
				    charArray[k] = charArray[k-1];
				    
				    charArray[k-1] = temp ;
				
			     }
			    
		    }
	 	}
		
//Display the sorted array organized in descending order
	    
		System.out.println("Sorted Character Array in Descending order ");
		
		for(int i = 0 ; i < charArray.length; i++) {
			
		System.out.println(charArray[i]);
		}
		
		
		

	}

}
