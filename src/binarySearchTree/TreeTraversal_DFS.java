package binarySearchTree;

import java.util.ArrayList;

import binarySearchTree.TreeTraversal_BFS.Node;

public class TreeTraversal_DFS {
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
		
		public ArrayList<Integer> dfsPreOrder(){
			return traversePreOrder(root); 
		}

		//preorder traverse to left then traverse to right
		private ArrayList<Integer> traversePreOrder(Node currentNode) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			 if (currentNode == null) {
			        return result; // return result when complete tree is traversed
			    }
            result.add(currentNode.data);
            result.addAll(traversePreOrder(currentNode.left));
            result.addAll(traversePreOrder(currentNode.right));
            return result;

		}   
}
