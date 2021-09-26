package com.mysolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BinaryTree {
	
	class Node {
		public int value;
		public Node left;
		public Node right;
		
		public Node(int value){
			this.value = value;
			right = null;
			left = null;
		}
	}
	
	static Node root;
	
	public static void main(String[] args) {
		List<String> tokens = new ArrayList<>();
        BufferedReader br = null;
 
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter:");
            StringTokenizer st = new StringTokenizer(br.readLine());
//            System.out.println(st.nextElement());
            while (st != null && st.hasMoreElements()) {
                tokens.add(st.nextToken());
            }
            BinaryTree bt = createBinaryTree(tokens);
            bt.traverseLevelOrder();
        }
        catch (IOException e) {
            System.out.println(e);
        }

	}

	
	
	private Node addRecursive(Node current, int value) {
		
		if(current == null) {
			return new Node(value);
		}
		
		if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
		
	}
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	private static BinaryTree createBinaryTree(List<String> tokens) {
		BinaryTree bt = new BinaryTree();
		for(String i : tokens) {
			bt.add(Integer.parseInt(i));
		}
		
		return bt;
	}
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
	public void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.value);
	    }
	}
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }

	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);

	    while (!nodes.isEmpty()) {

	        Node node = nodes.remove();

	        

	        if (node.left != null) {
	            nodes.add(node.left);
	        }

	        if (node.right != null) {
	            nodes.add(node.right);
	        }
	        
	        if((node.left == null) || (node.right == null))
	        	System.out.print(" " + node.value);
	    }
	}
	
//	  public void inOrder() {
//		    inOrder(root);
//		 }  
//		  
//		  private void inOrder(Node node) {
//		    if (node == null) {
//		      return;
//		    }   
//		    
//		    inOrder(node.left);
//		    if((node.left == null) || (node.right == null))
//		    System.out.printf("%s ", node.value);
//		    inOrder(node.right);
//		  }
	
//	public static void printNodes(BinaryTree bt) {
//	    if (root == null) {
//	        return;
//	    }
//
//	    Queue<Node> nodes = new LinkedList<>();
//	    nodes.add(root);
//
//	    while (!nodes.isEmpty()) {
//
//	        Node node = nodes.remove();
//	        
//	        if((node.left == null) || (node.right == null)) {
//	        	System.out.print(" " + node.value);
//	        }
//	        
////	        if ((node.left != null) || (node.right != null)) {
////	            nodes.add(node.left);
////	        } else 
////	        System.out.print(" " + node.value);
////	        if (node.right != null) {
////	            nodes.add(node.right);
////	        }
//	    }
//	}
}
