package com.datastructure.stack;

public class Stack {
	
	private static final int MAX_SIZE = 10;
	private int size;
	private int[] array;
	private int top;
	
	public Stack(){
		this(MAX_SIZE);
	}
	
	public Stack(int size){
		this.size = size;
		this.array = new int[size];
		this.top = -1;
	}
	

	void push(int x){
		if(top >= size){
			System.out.println("Stack is full");
		}else{
			top = top + 1;
			array[top] = x;
		}
	}
	
	int pop(){
		int temp;
		if(top<0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			temp = array[top];
			top = top-1;
			return temp;
		}
	}
	
	void print(){
		if(top<0)
			return;
		
		System.out.print('[');
		for(int i=0;i<=top;i++){
			if(i==top)
				System.out.print( array[i]);
			else
				System.out.print( array[i] + "\t");
		}
		System.out.print(']' + "\n");
	}
	
	
	
	public static void main(String[] args) {
		Stack stackDemo = new Stack(5);
		stackDemo.push(12);
		stackDemo.push(11);
		
		stackDemo.print();
		
		System.out.println("Pop the element:" + stackDemo.pop());
		stackDemo.print();
		
		System.out.println("Pop the element:" + stackDemo.pop());
		System.out.println("Pop the element:" + stackDemo.pop());
		
		stackDemo.print();

	}

}

