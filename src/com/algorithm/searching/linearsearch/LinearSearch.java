package com.algorithm.searching.linearsearch;

public class LinearSearch {
	public static int search(int a[], int x){
		for(int i=0;i<a.length;i++){
			if(a[i] ==x)
				return i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		 int[] array = {12, 55, 45, 11, 23, 20, 17, 24, 9};
		 int pos = -1;
		 if( (pos= search(array,12)) == -1)
			 System.out.println("Not found!");
		 else
			 System.out.println("Found in " + pos + " Position!");
		 
		 System.out.println(java.nio.ByteOrder.nativeOrder().toString());
	}
}