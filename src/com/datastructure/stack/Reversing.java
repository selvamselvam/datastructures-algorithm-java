package com.datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Reversing {

	public static String ReverseString(String str){
		Stack<Character> stack = new Stack<Character>();
		 for(int i=0;i<str.length();i++)  
			 stack.push(str.charAt(i));  

		 String output ="";
		 while(!stack.isEmpty())  
		      output += stack.pop();  
		 return output;
		     
	}

	public static List<String> ReverseSenten(String[] parts){
		Stack<String> stack = new Stack<String>();
		 for(int i=0;i<parts.length;i++)  
			 stack.push(parts[i]);  

		 List<String> list = new ArrayList<String>();
		 while(!stack.isEmpty())  
			 list.add(stack.pop());
		 
		 return list;
	}

	
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		System.out.println(str);
		
		System.out.println(ReverseString(str));

		String[] parts = str.split(" ");
		System.out.println(ReverseSenten(parts).toString());

	}

}
