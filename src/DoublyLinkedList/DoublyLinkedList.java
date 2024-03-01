package DoublyLinkedList;

// DoublyLinkedList with have prev node as well as it will have next and prev node location
// handle exceptions in below code like empty ll and removing element , fetch index greater then length etc.
public class DoublyLinkedList {
	Node head = null;
	Node tail = null;
	int length;
	
	//constructor with data , next and prev node 
	class Node {
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
		}
	}

	// to add new node in LL
	public void append(int data) {
		Node node = new Node(data);
		if(length==0) {
			head = node ;
			tail = node;
			length++;
		}
		else {
			node.prev = tail;
			tail.next = node;
			tail = node;
			length ++;
		}
	}

	public void printAll() {
		Node temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	// remove last node
	public void removeLast() {
		Node temp = tail.prev;
		if(length == 1) {
			head= null;
			tail = null;
			length --;

		}
		else {
			temp.next = null;
			tail.prev = null;
			tail= temp;
			length --;
		}

	}
	
	//add node at start
	public void prepend(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head.prev = temp;
		head = temp;
		length++;
	}
	
	//remove firt node
	public void removeFirst() {
		Node temp = head;
		if(length==1) {
			head= null;
			tail = null;
			length--;
		}
		else {
		head = head.next;
		head.prev = null;
		temp.next = null;
		length --;
		}
				
	}
	
	public Node getAtindex(int index) {
		Node temp = head;
		
		if(index<length/2) {
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		}
		else {
			temp = tail;
			for(int i = length-1; i>index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}
	
	//update value at a index
	public Boolean setAtIndex(int index, int data) {
		Node temp = getAtindex(index);
		if(temp !=null) {
		temp.data = data;
		return true;
		}
		return false;
	}
	
	// inserts value at index
	public Boolean insertAtIndex(int index, int value) {
		if(index<0 || index>length) {
			return false;
		}
		else if(index == length) {
			append(value);
			return true;
		}
		else if(index == 0) {
			prepend(value);
			return true;
		}else {
		Node temp = new Node(value);
		Node before = getAtindex(index-1);
		Node after = before.next;
		
		temp.prev = before;
		before.next = temp;
		
		temp.next = after;
		after.prev = temp;
		
		length++;
		return true;
		}
	}
	
	public void removeAtIndex(int index) {
		if(index<0 || index > length ) {
			System.out.println("Enter valid length");
			return;//handle with what you want to return as per req.
		}
		if(index==0) {
			removeFirst();
		}
		else if(index==length-1) {
			removeLast();
		}
		else {
		Node temp = getAtindex(index);
		Node before = temp.prev;
		Node after = temp.next;
		
		before.next = after;
		after.prev = before;
		
		temp.next= null;
				temp.prev = null;
				length--;
		}
	}

}
