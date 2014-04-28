package com.datastructure.list.circular;

public class CircularLinkedList {
	private Node start;
	private int count;

	public void append(int x) {
		count++;
		Node temp = new Node(x);
		if (start == null) {
			start = temp;
		} else {
			Node tp = start;
			while (tp.link != start) {
				tp = tp.link;
			}
			tp.link = temp;
		}
		temp.link = start;
	}

	public void addBeg(int x) {
		count++;
		Node temp = new Node(x);
		if (start == null) {
			temp.link = temp;
		} else {
			Node tp = start;
			while (tp.link != start) {
				tp = tp.link;
			}
			tp.link = temp;
			temp.link = start;
		}
		start = temp;
	}

	public void addAt(int pos, int x) {
		Node temp, tp;
		temp = new Node(x);
		tp = start;
		for (int i = 0; i < pos; i++) {
			if (tp.link == start)
				break;
			tp = tp.link;
		}
		temp.link = tp.link;
		tp.link = temp;
		count++;
	}

	public void displayList() {
		if (start == null)
			System.out.println("List is empty..");
		else {
			Node temp = start;
			System.out.print("->");
			while (temp.link != start) {
				System.out.println(" " + temp.data);
				temp = temp.link;
			}
			System.out.println(temp.data + " ->");
		}
	}

	public void deleteAt(int position) {
		Node current = start;
		Node previous = start;
		for (int i = 0; i < position; i++) {
			if (current.link == start)
				break;
			previous = current;
			current = current.link;
		}
		System.out.print(current.data);
		if (position == 0)
			deleteFirst();
		else
			previous.link = current.link;
		count--;
	}

	public void deleteFirst() {
		Node temp = start;
		while (temp.link != start) {
			temp = temp.link;
		}
		temp.link = start.link;
		start = start.link;
		count--;
	}

	public int getCount() {
		return count;
	}

	private static class Node {
		int data;
		Node link;

		public Node(int data) {
			this.data = data;
		}

		@SuppressWarnings("unused")
		public Node(int data, Node link) {
			this.data = data;
			this.link = link;
		}
	}
	
	public static void main(String args[]){
	    CircularLinkedList ccl=new CircularLinkedList();
	    ccl.addBeg(1);
	    ccl.append(2);
	    ccl.append(3);
	    ccl.append(4);
	    ccl.addAt(1, 0);
	    ccl.append(5);
	    ccl.append(12);
	    ccl.displayList();
	    ccl.deleteAt(1); //index starts from zero
	    System.out.println("After deletion....");
	    ccl.displayList();
	}
	
}
