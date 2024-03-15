package binarySearchTree;

import java.util.ArrayList;
import java.util.Queue;

import linkedList.LinkedList;

// bfs traverse with 
public class TreeTraversal_BFS {
    Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public void insert(int data) {
		if(root == null) {
			root = new Node(data);
		}
		insert(root , data);
	}

	private Node insert(Node currentNode, int data) {
		if(currentNode == null) {
			return new Node(data);
		}
		if(data < currentNode.data) {
			currentNode.left = insert(currentNode.left, data);
		}
		else if(data > currentNode.data) {
			currentNode.right = insert (currentNode.right, data);
		}
		return currentNode;
	}
	
	
	// tree traversal BFS
	public ArrayList<Integer> BFS(){
		Node currentNode = root;
      Queue<Node> queue = new java.util.LinkedList<>();
       queue.add(currentNode);
       ArrayList<Integer> result = new ArrayList<Integer>();
       
       while(queue.size() > 0) {
    	   currentNode = queue.remove();
    	   result.add(currentNode.data);
    	   if(currentNode.left != null) {
    		   queue.add(currentNode.left);
    	   }
    	   if(currentNode.right != null) {
    		   queue.add(currentNode.right);
    	   }
       }
       return result;
       
	}
}
