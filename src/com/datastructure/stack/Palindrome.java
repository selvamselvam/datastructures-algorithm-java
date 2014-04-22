package com.datastructure.stack;

import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
        String inputString = "madam";
        
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }

}
