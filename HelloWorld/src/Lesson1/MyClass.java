package Lesson1;

import java.util.Scanner;

public class MyClass {

/*This is my first program
 * print hello world using main method
 */

	public static void main(String[] args) {
		int i =0;
	       int num =0;
	       
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int count=0; 	 
	          
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		count = count + 1;
		     }
		  }
		  if (count == 2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       
	       System.out.println(primeNumbers);
			}
		
		

	}
		
		


	


