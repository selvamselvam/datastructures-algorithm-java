package com.utility;

public class Swapping {

	public static void main(String[] args) {
		
		int a = 2; 
		int b = 4; 
		      
		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
		       
		a = a^b; //now a is 6 and b is 4
		b = a^b; //now a is 6 but b is 2 (original value of a)
		a = a^b; //now a is 4 and b is 2, numbers are swapped
		      
		System.out.println("value of a and b after swapping using XOR bitwise operation, a: " 
							+ a +" b: " + b);

	}

}
