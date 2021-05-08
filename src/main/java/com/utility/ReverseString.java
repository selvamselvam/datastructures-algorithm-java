package com.utility;

public class ReverseString {

	private static String temp = "";
	public static String Reverse(String str){
		int len =str.length();
		if(len ==0)
			return temp;
		else{
		temp = temp+ str.charAt(len-1);
		return Reverse(str.substring(0,len-1));
		}
	}
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length()  <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		String str= "Hello Wipro";
		System.out.println(str);
		System.out.println(reverse(str));

	}

}
