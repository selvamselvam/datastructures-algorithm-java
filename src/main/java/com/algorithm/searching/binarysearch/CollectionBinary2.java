package com.algorithm.searching.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionBinary2 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
	    list.add(new Employee(10,11, "AAA"));
	    list.add(new Employee(20,21, "BBB"));
	    list.add(new Employee(30,31, "CCC"));

	    Comparator<Employee> cmp = new Comparator<Employee>() {
	      public int compare(Employee u1, Employee u2) {
	        return u1.getId().compareTo(u2.getId());
	      }
	    };

	    Collections.sort(list, cmp);

	    int index = Collections.binarySearch(list, new Employee(20,21, "BBB"), cmp);
	    System.out.println(index);    // Output: 1

	    index = Collections.binarySearch(list, new Employee(10, 11, null), cmp);
	    System.out.println(index);    // Output: 0

	}
}
