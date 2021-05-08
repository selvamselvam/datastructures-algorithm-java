package com.datastructure.stack;

public class RecursiveFactorial {
	public static int fact(int x){
		if(x == 0)
			return 1;
		else
			return x * fact(x-1);
	}
	public static void main(String[] args) {

		System.out.println(fact(3));

	}

}
