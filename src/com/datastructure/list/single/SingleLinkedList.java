package com.datastructure.list.single;

public class SingleLinkedList {

	private Node head = null;

	public Node searchlist(int x){
		if(head.num == x)
			return head;
		else{
			head = head.next;
			return searchlist(x);
		}
	}
	
    public void append(int val) {
        Node lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node(val);
        } else {
            lastNode.next = new Node(val);
        }
    }

    public void delete(int val) {
        if(head == null){
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null && currNode.num != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(prevNode == null){
            head = head.next;
            return;
        }
        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
            return;
        }
        prevNode.next = currNode.next;
    }

    public void print() {
        System.out.println("");
        if(head == null){
            System.out.print("EMPTY");
            return;
        }
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }
        Node tmpNode = head;
        while (tmpNode.next != null) {
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }
    
	public static void main(String[] args) {
		SingleLinkedList myList = new SingleLinkedList();
        //myList.print();
        myList.append(35);
        myList.append(33);
        myList.append(30);
        
        myList.print();
        //myList.delete(33);
        //myList.delete(35);
        //myList.delete(35);
        //myList.print();
        
        System.out.println(" \n Search Result"+ myList.searchlist(33).num);

	}

}
