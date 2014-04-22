package com.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySample {

	private static int MAX_SIZE = 10;
	
	public static void main(String[] args) {
		
		int[] array1 = new int[MAX_SIZE];
		
		for(int i=0;i<MAX_SIZE;i++)
			array1[i] = i;

		for(int i=0;i<MAX_SIZE;i++)
			System.out.println(array1[i]);

		System.out.println(Arrays.toString(array1));
		
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<MAX_SIZE;i++)
			list.add(i);
		
		for(int i=0;i<MAX_SIZE;i++)
			System.out.println(list.get(i));
		
		System.out.println(list.toString());
		
		

	}

}
