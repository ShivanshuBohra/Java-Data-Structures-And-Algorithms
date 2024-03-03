package queueUsingLinkedList;


// in linked list to add or to remove at start bigO is O(1)
// to add in end of LL it is O(1) but to remove at end is O(n) as to remove it need to traverse to 2nd last node
// so for enque we will add at tail end and to add we add at head end for both enque and deque are O(1)
public class Queue {
   Node first;
   Node last;
   int length;
	class Node {
		 int data;
		 Node next;
		 Node(int data){
			 this.data = data;
		 }
	}
	// add node at end
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(length == 0) {
			first = newNode;
			last = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
		length ++;
	}
	
	// remove from start
	public void dequeue() {
		 if(length ==1) {
			 first = null;
			last = null;
		 }
		 else {
			 Node temp = first;
			 first = first.next;
			 temp.next = null;
		 }
		 length --;
	}
	
	public void printAll() {
		Node temp = first;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
