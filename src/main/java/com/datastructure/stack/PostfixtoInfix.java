package com.datastructure.stack;
import java.util.Stack;

public class PostfixtoInfix {

	public static int evaluate(String g) {
		Stack<Character> stack = new Stack<Character>();
		
	    int temp = 0;
	    for (int i = 0; i < g.length(); i++) {
	        if (g.charAt(i) != '+' && g.charAt(i) != '-' && g.charAt(i) != '*'
	                && g.charAt(i) != '/') {
	            stack.push(g.charAt(i));
	        } else {
	            int a = stack.pop() - '0';
	            int c = stack.pop() - '0';

	            if (g.charAt(i) == '+') {
	                temp = a + c;
	                stack.push((char)(temp + '0'));
	            }
	            // nextone
	            if (g.charAt(i) == '-') {
	                temp = (c - a);
	                stack.push((char)(temp + '0'));
	            }
	            // two
	            if (g.charAt(i) == '*') {
	                temp = (c * a);
	                stack.push((char)(temp + '0'));
	            }
	            // three
	            if (g.charAt(i) == '/') {
	                temp = (c / a);
	                stack.push((char)(temp + '0'));
	            }
	        }
	    }
	    return stack.pop() - '0';
	}
	
	public static void main(String[] args) {
		System.out.println(evaluate("234*+"));
	}

}
