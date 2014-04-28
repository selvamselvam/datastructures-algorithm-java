package com.datastructure.tree.binary;

public class BinaryTree {
	public Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	/** 
	   Returns true if the given target is in the binary tree. 
	   Uses a recursive helper. 
	  */ 
	  public boolean lookup(int data) { 
	    return(lookup(root, data)); 
	  } 
	 

	  /** 
	   Recursive lookup  -- given a node, recur 
	   down searching for the given data. 
	  */ 
	  private boolean lookup(Node node, int data) { 
	    if (node==null) { 
	      return(false); 
	    }

	    if (data==node.data) { 
	      return(true); 
	    } 
	    else if (data<node.data) { 
	      return(lookup(node.left, data)); 
	    } 
	    else { 
	      return(lookup(node.right, data)); 
	    } 
	  } 
	 

	  /** 
	   Inserts the given data into the binary tree. 
	   Uses a recursive helper. 
	  */ 
	  public void insert(int data) { 
	    root = insert(root, data); 
	  } 
	 

	  /** 
	   Recursive insert -- given a node pointer, recur down and 
	   insert the given data into the tree. Returns the new 
	   node pointer (the standard way to communicate 
	   a changed pointer back to the caller). 
	  */ 
	  private Node insert(Node node, int data) { 
	    if (node==null) { 
	      node = new Node(data); 
	    } 
	    else { 
	      if (data <= node.data) { 
	        node.left = insert(node.left, data); 
	      } 
	      else { 
	        node.right = insert(node.right, data); 
	      } 
	    }

	    return(node); // in any case, return the new pointer to the caller 
	  } 
	  
	  /** 
	  Prints the node values in the "inorder" order. 
	  Uses a recursive helper to do the traversal. 
	 */ 
	 public void printTree() { 
	  printTree(root); 
	  System.out.println(); 
	 }
	 private void printTree(Node node) { 
	  if (node == null) return;

	  // left, node itself, right 
	  printTree(node.left); 
	  System.out.print(node.data + "  "); 
	  printTree(node.right); 
	 } 
	 
	 
	 /** 
	 Returns the number of nodes in the tree. 
	 Uses a recursive helper that recurs 
	 down the tree and counts the nodes. 
	*/ 
	
	public int size(Node root) { 
	  if (root == null) return(0); 
	  else { 
	    return(size(root.left) + 1 + size(root.right)); 
	  } 
	} 
	
	  
	public int maxDepth(Node node) { 
		  if (node==null) { 
		    return(0); 
		  } 
		  else { 
		    int lDepth = maxDepth(node.left); 
		    int rDepth = maxDepth(node.right);

		    // use the larger + 1 
		    return(Math.max(lDepth, rDepth) + 1); 
		  } 
		} 
	/** 
	 Changes the tree into its mirror image.

	 So the tree... 
	       4 
	      / \ 
	     2   5 
	    / \ 
	   1   3

	 is changed to... 
	       4 
	      / \ 
	     5   2 
	        / \ 
	       3   1

	 Uses a recursive helper that recurs over the tree, 
	 swapping the left/right pointers. 
	*/ 
	
	public void mirror(Node node) { 
	  if (node != null) { 
	    // do the sub-trees 
	    mirror(node.left); 
	    mirror(node.right);

	    // swap the left/right pointers 
	    Node temp = node.left; 
	    node.left = node.right; 
	    node.right = temp; 
	  } 
	} 
	
	
	/** 
	 Tests if a tree meets the conditions to be a 
	 binary search tree (BST). Uses the efficient 
	 recursive helper. 
	*/ 
	public boolean isBST2() { 
	 return( isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE) ); 
	}
	/** 
	  Efficient BST helper -- Given a node, and min and max values, 
	  recurs down the tree to verify that it is a BST, and that all 
	  its nodes are within the min..max range. Works in O(n) time -- 
	  visits each node only once. 
	*/ 
	private boolean isBST2(Node node, int min, int max) { 
	  if (node==null) { 
	    return(true); 
	  } 
	  else { 
	   // left should be in range  min...node.data 
	    boolean leftOk = isBST2(node.left, min, node.data);

	    // if the left is not ok, bail out 
	    if (!leftOk) return(false);

	    // right should be in range node.data+1..max 
	    boolean rightOk = isBST2(node.right, node.data+1, max);

	    return(rightOk); 
	  } 
	} 
	  
	
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		
		b.root = new Node(2); 
		b.root.left = new Node(1); 
		b.root.right = new Node(3);
		b.root.right.right = new Node(4); 

		System.out.print("All Binary Tree Values:" );
		b.printTree();
		//System.out.println();
		
		System.out.println("Binary Tree Size:" + b.size(b.root));
		System.out.println("Binary Tree Max Depth:" + b.maxDepth(b.root));
		
		
		System.out.print("All Binary Tree Mirror Values:" );
		b.mirror(b.root);
		b.printTree();
		
		System.out.println("Is Binary Tree:"+b.isBST2());
		
	}

}
