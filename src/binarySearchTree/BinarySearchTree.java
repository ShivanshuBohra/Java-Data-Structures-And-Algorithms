package binarySearchTree;

public class BinarySearchTree {

	Node root;
	
	class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	
	public Boolean insert(int data) {
		Node newNode = new Node(data);
		while(true) {
			if (root == null){
				root = newNode;
				return true;
			}
			//set pointer to root
			Node temp = root;
			
				while(true) {
					// if already data is there do not add as BST will not have duplicates
					if(newNode.data == temp.data) {
						return false;
					}
					// if data is less then node then go left else right 
					if(newNode.data < temp.data) {
						// if node is null add node 
						if(temp.left == null) {
							temp.left = newNode;
							return true;
						}
						temp = temp.left;
					}
					
					// if data is greater then node go right
					if(newNode.data > temp.data) {
						if(temp.right == null) {
							temp.right = newNode;
							return true;
						}
						temp = temp.right;
					}
				}
				
		}
	}
	
	public boolean contains(int data) {
		if(root == null) return false;
		Node temp = root;
		while(temp != null) {
			if(data  < temp.data) {
				temp = temp.left;
			}
			else if (data > temp.data){
				temp = temp.right;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
}
