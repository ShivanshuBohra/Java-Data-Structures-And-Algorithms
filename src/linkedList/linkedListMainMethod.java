package linkedList;

public class linkedListMainMethod {
 public static void main(String[] args) {
	
	  LinkedList linkedList = new LinkedList();
	  linkedList.append(4);
	  linkedList.append(3);
	  linkedList.append(5);
	
	  linkedList.removeLast(); 
   linkedList.prePend(1);
   linkedList.prePend(2);
	 linkedList.removeLast();
	 linkedList.removeFirst();
	 
	// System.out.println(linkedList.getIndex(2));
	
	//  linkedList.printLinkedList();
	  
	 //  Updates value at a particular index
     linkedList.setAtIndex(1, 4);
	  
	//  insert at a particular index
	  linkedList.insertAtIndex(0, 4);
	  linkedList.insertAtIndex(1, 9);
	  
	  linkedList.removeAtIndex(0);
	
	  
	  linkedList.printLinkedList();
	  System.out.println("----");
	  
	  //reverse linked list
	  linkedList.reverse();
	  linkedList.printLinkedList();
	 

	 
}
}
