package com.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
	
public static void quicksort(int a[], int low, int high){
		
		if(low < high){
			int p = part(a,low,high);
			quicksort(a,low,p-1);
			quicksort(a,p+1,high);
		}
	}
	
	private static int part(int a[], int l, int h){
		int p = h-1;
		int first = l;
		
		for(int i=l;i<h;i++){
			if(a[i]<a[p]){
				int t = a[i]; // swap a[i] and a[first]
				a[i] = a[first];
				a[first] = t;
				first++;
			}
			
			int temp =a[p]; //swap a[p] and a[first]
			a[p] = a[first];
			a[first] = temp; 
			
		}
		return first;
	}
	
	
	public static void main(String[] args) {
		int a[]={23,45,34,67};
		System.out.println(Arrays.toString(a));
		quicksort(a,0,a.length);
		System.out.println(Arrays.toString(a));
	}

}
