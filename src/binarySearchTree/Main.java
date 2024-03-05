package binarySearchTree;

public class Main {
   public static void main(String[] args) {
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(10);
	bst.insert(5);
	bst.insert(2);
	bst.insert(3);
	System.out.println(bst.contains(11));
}
}
