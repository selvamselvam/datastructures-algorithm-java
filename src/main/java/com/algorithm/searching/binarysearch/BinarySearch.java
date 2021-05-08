package com.algorithm.searching.binarysearch;

import java.util.Arrays;

public class BinarySearch {
	
	public static int BinSearch(int a[], int low, int high, int x){
		int mid = (low+high)/2;
		if(a[mid] == x)
			return mid;
		else if(a[mid] > x)
			return BinSearch(a,low,mid-1,x);
		else
			return BinSearch(a,mid+1,high,x);
	}

	public static int Binarysearch(int a[], int x){
		int low = 0, high = a.length -1;
		int mid = 0;
		while(low <= high){
			mid = (low + high)/2;
			
			if(a[mid] > x)
				high = mid-1;
			else if(a[mid] < x)
				low = mid+1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {12, 55, 45, 11, 23, 20, 17, 24, 9};
		System.out.println("Before Sort:" + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After Sort:" + Arrays.toString(array));
		 int pos = -1;
		 if( (pos= Binarysearch(array,11)) == -1)
			 System.out.println("Not found!");
		 else
			 System.out.println("Found in " + (pos+1) + " Position!");

	}

}
