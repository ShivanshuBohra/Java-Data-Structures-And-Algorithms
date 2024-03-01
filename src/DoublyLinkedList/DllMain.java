package DoublyLinkedList;

public class DllMain {
   public static void main(String[] args) {
	DoublyLinkedList dll = new DoublyLinkedList();
	dll.append(2);
	dll.append(3);
	dll.append(4);
	   dll.insertAtIndex(0, 7);

	
	dll.removeLast();
	
	dll.prepend(1);
	dll.prepend(0);
	
	dll.removeFirst();
	dll.printAll();
	System.out.println("---");
	//System.out.println(dll.getAtindex(2).data);
	//update value at a index
	dll.setAtIndex(1, 5);
	//insert new node at index
   dll.insertAtIndex(0, 7);
	dll.removeAtIndex(0);


	dll.printAll();
}
}
