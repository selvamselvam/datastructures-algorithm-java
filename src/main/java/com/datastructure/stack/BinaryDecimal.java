package com.datastructure.stack;

import java.util.Stack;

public class BinaryDecimal {

	public static double BinarytoDecimal(String binary){
		double result = 0;
	    for (int i = 0; i < binary.length(); i++)
	       result += Double.parseDouble(binary.substring(i, i + 1)) * Math.pow(2, i);
		return result;
	}
	
	private static Stack<Integer> DecimaltoBinay(int number) {
		Stack<Integer> stack = new Stack<Integer>();
		while(number>0){
			Integer bit = number % 2;
			stack.push(bit);
			number = (int) Math.floor(number / 2);
		}
		return stack;
    }
	
	public static void main(String[] args) {
		
		// Convert Decimal to Binary format
		Stack<Integer> s =DecimaltoBinay(5);
		System.out.println(s.toString());
		
		// Convert Binary format to Binary String format
		String str = "";
		while(!s.isEmpty()){
			str+=s.pop();
		}

		// Convert from Binary String format to Decimal format
		System.out.println( str);
		System.out.println( BinarytoDecimal(str));
		
		
	}

}
