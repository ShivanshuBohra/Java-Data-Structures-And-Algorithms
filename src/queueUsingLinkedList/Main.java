package queueUsingLinkedList;

public class Main {
public static void main(String[] args) {
	Queue queue = new Queue();
	queue.enqueue(10);
	queue.enqueue(11);
	queue.enqueue(12);
	
	queue.printAll();
	
	queue.dequeue();
	
	
	System.out.println("----");
	queue.printAll();


	
}
}
