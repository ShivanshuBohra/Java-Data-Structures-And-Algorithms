package stackUsingLinkedList;

//Stack implementation using linked list
// in linked list to add or to remove at start bigO is O(1)
//to add in end of LL it is O(1) but to remove at end is O(n) as to remove it need to traverse to 2nd last node
//so for Stack we will use head as top and add new nodes to top
// head(top) ->  head.next-> .... -> tail(bottom)
public class Stack {
	//represents top element in stack
	Node top;
	// height of stack
    int height;
    
	  class Node{
		  int data;
		  Node next;
		  
		  Node(int data){
			  this.data = data;
		  }
	  }
	  
	  // prepend to push an element as our top is first element of linked list and tail is bottom 
	  public void push(int data) {
		  Node node = new Node(data);
		  
		  if(height ==0) {
			  top = node;
		  }
		  else {
			  node.next = top;
			  top = node;
		  }
		  height ++;
	  }
	  
	  // remove top node(1st node)
	  public void pop() {
		  if(height==1) {
			  top = null;
			  height --;

		  }
		  else {
			  Node temp = top;
			  top = top.next;
			  temp.next = null;
			  height--;
		  }
	  }
	  
	  public void printStack() {
		  Node temp  = top;
		  while(temp != null) {
			  System.out.println(temp.data);
			  temp = temp.next;
		  }
	  }
	  
}
