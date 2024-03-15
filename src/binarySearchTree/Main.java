package binarySearchTree;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
//	BinarySearchTree bst = new BinarySearchTree();
//	bst.insert(10);
//	bst.insert(5);
//	bst.insert(2);
//	bst.insert(3);
//	System.out.println(bst.contains(11));
//	
//	Recursive_BinarySearchTree rBST = new Recursive_BinarySearchTree();
//	rBST.rInsert(10);
//	rBST.rInsert(20);
//	rBST.rInsert(9);
//	rBST.rInsert(7);
//	rBST.rInsert(21);
//	
//	System.out.println(rBST.rContains(7));
//	
//	TreeTraversal_BFS bfs = new TreeTraversal_BFS();
//	bfs.insert(47);
//	bfs.insert(21);
//	bfs.insert(76);
//	bfs.insert(18);
//	bfs.insert(27);
//	bfs.insert(52);
//	bfs.insert(82);
//	System.out.println(bfs.BFS());
	   
		
		TreeTraversal_DFS dfs = new TreeTraversal_DFS();
		dfs.insert(47);
		dfs.insert(21);
		dfs.insert(76);
		dfs.insert(18);
		dfs.insert(27);
		dfs.insert(52);
		dfs.insert(82);
		
		System.out.println(dfs.dfsPreOrder());


}
}
