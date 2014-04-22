package com.algorithm.searching.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionBinary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(55);
		list.add(45);
		list.add(11);
		list.add(23);
		list.add(20);
		list.add(17);
		list.add(24);
		list.add(9);
		
		System.out.println("Before Sort:" + list.toString());
		Collections.sort(list);
		System.out.println("After Sort:" + list.toString());
		
		int pos = 0;
		 if( (pos= Collections.binarySearch(list,11)) == -1)
			 System.out.println("Not found!");
		 else
			 System.out.println("Found in " + (pos+1) + " Position!");
	}
}
