package linkedList;

public class LinkedList {
	// head and tail are pointer to satrt and end node
	private Node head;
	private Node tail;
	int length;
	
	// node will have data and next node pointer
    class Node {
    	int data;
    	Node next;
    	Node(int data){
    		this.data = data;
    	}
    }
    
    public void append(int data) {
    	Node node = new Node(data);
    	if(length==0) {
    		head=node;
    		tail = node;
    	}
    	else {
    		tail.next = node;
    		tail = node;
    	}
		length++;
    }
    
    public void printLinkedList() {
    	Node tempNode = head;
    	while(tempNode != null) {
    		System.out.println(tempNode.data);
    		tempNode = tempNode.next;
    	}
    }

	public void removeLast() {
		if(length==0) {
			System.out.println("EMPTY LINKED LIST");
		}
		if(length ==1) {
			head = null;
			tail = null;
			length--;
		}
		else {
			Node tempNode = head;
			Node preTemp = head;
			while(tempNode.next != null) {
				preTemp = tempNode;
				tempNode = tempNode.next;
			}
			tail = preTemp;
			tail.next = null;
			length--;
		}
	}

	public void prePend(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		length++;
		
	}
	public void removeFirst() {
		if(length ==0) {
			System.out.println("Empty aray list");
		}
		else if(length ==1) {
			head =null;
			tail = null; 
			length--;
		}
		else {
		Node tempNode = head;
			head = head.next;
			tempNode.next = null;
			length--;
		}
		
	}
	
	public int getIndex(int index) {
		Node tempNode= head;
		if(length ==0) {
			System.out.println("EMPTY ARRAY");
			return -1;
			
		}
		else {
			
			for(int i =0; i<index; i++) {
				
				tempNode = tempNode.next;
			}
		}
		return  tempNode.data;
	}
//update value at a index
	public void setAtIndex(int index , int value) {
		Node tempNode = head;
		if(length ==0) {
			Node node = new Node(value);
			head= node;
			tail=node;
		}
		for(int i =0;i<index ;i++) {
			tempNode = tempNode.next;
		}
		tempNode.data = value;
	}

	public void insertAtIndex(int index, int value) {
		//check index should be greeater then 0 and less then length
		Node node = new Node(value);
		Node tempNode = head;
		Node pre = null;
		//use prepend if at start
       if (index == 0) {
    	   node.next = head;
    	   head = node;
    	   length++;
       }
       else {
    	   for(int i =0;i<index;i++) {
    		   pre=tempNode;
    		tempNode =  tempNode.next;
    	   }
    	   pre.next = node;
    	   node.next = tempNode;
    	   length ++;
       }
		
	}

	public void removeAtIndex(int index) {
		//check index should be greeater then 0 and less then length
		Node prev = null;
		Node temp = head;
		if(index ==0) {
			removeFirst();
		}
		else if(index == length-1) {
			removeLast();
		}
		else {
			for(int i =0;i<index;i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next =temp.next;
			temp.next = null;
	    	   length --;
		}
		
	}

	// reverse linked list
	public void reverse() {
      Node temp = head;
      head= tail;
      tail = temp;
      Node after = temp.next;
      Node before = null;
      for(int i = 0;i< length; i++) {
    	  after = temp.next;
    	  temp.next = before;
    	  before = temp;
    	  temp = after;
      }
      
	}
    
    
}
