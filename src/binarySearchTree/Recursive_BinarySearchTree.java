package binarySearchTree;

public class Recursive_BinarySearchTree {
	 
	Node root;
	
	 class Node{
		 int data;
		 Node left;
		 Node right;
		 Node(int data){
			 this.data = data;
		 }
	 }
	 
	// Insert node using recursion
	 public void rInsert(int data) {
		 if(root == null ) root = new Node	(data);
		 rInsert(root , data);
	 }

	private Node rInsert(Node currentNode, int data) {
              		if(currentNode == null) {
              			return new Node(data);
              		};
              		if(data< currentNode.data) {
              		currentNode.left = rInsert(currentNode.left , data);
              		}
              		else if(data> currentNode.data) {
              			currentNode.right = rInsert(currentNode.right, data);
              		}
              		return currentNode;
	}
	 
	public Boolean rContains(int data) {
		return rContains(root , data);
	}

	private Boolean rContains(Node currentNode, int data) {
      		if(currentNode == null) {
      			return false;
      		}
      		if(currentNode.data == data) {
      			return true;
      		}
      		if (data <currentNode.data) {
      		 return	rContains(currentNode.left, data);
      		}
      		else {
      			return rContains(currentNode.right, data);
      		}
	}
	
	public void rDeleteNode(int data) {
		rDeleteNode(root , data);
	}

	private Node rDeleteNode(Node currentNode, int data) {
		 if (currentNode == null) {
			 return null;
		 }
		 if (data < currentNode.data) {
			 currentNode.left = rDeleteNode(currentNode.left, data);
		 }
		 if (data > currentNode.data) {
			 currentNode.right = rDeleteNode(currentNode.right, data);
		 }
		 // when we reached node to be deleted
	 //4 cases 1. deleting node is leaf node no left or right node,  
	//	2.  Node.left is null 
    // 3. node's right is null		 
    // 4.  deleting node has child on both sides left amd righht no null on both sides 
		 else {
			 // case 1
			 if(currentNode.left == null && currentNode.right == null) {
				 return null;
			 }
			// case 2
			 else if(currentNode.left == null) {
				 currentNode = currentNode.right;
			 }
			// case 3
			 else if(currentNode.right == null) {
				 currentNode = currentNode.left;

			 }
			 //// case 4
			 else {
				 int subTreeMin = minValue(currentNode.right);
				 currentNode.data = subTreeMin;
				 currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
			 }
		 }
		 return currentNode;
	}
	
	public int minValue(Node currentNode) {
		while(currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.data;
	}

}
