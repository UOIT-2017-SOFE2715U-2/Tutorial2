import java.lang.System;

public class Tutorial2Main {

	public static void main(String[] args) {
		// Create linked list
		MyLinkedList linkedList = new MyLinkedList();
		// Add nodes with specified values
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		
		// Start from the head node
		Node currentNode = linkedList.getHead();
		//i as index
		int i = 0;
		
		// print header for output
		System.out.printf("index value\n");
		// iterate through the linked list &
		// print the values of the nodes
		while (currentNode != null){
			System.out.printf("%3d %6s",i++,currentNode.getValue() + "\n");
			currentNode = currentNode.getNext();
		}
		
		// remove node with value "C" with index 2
		linkedList.remove(2);
		System.out.print("\nRemoved node with value 'C' at index 2\n");
		
		// add node at index 2 with value "Z"
		linkedList.add("Z", 2);
		System.out.print("Added node with value 'Z' at index 2\n\n");
		
		// start from the head node
		currentNode = linkedList.getHead();
		// reset the index
		i = 0;
		
		// print header for the output
		System.out.printf("index value\n");
		// again, 
		// iterate through the linked list &
		// print the values of the nodes
		while (currentNode != null){
			System.out.printf("%3d %6s",i++,currentNode.getValue() + "\n");
			currentNode = currentNode.getNext();
		}
	}
}
/*
In your program do the following:

1. Create the linked list object.

2. Call the linked list object function "add" to add your Node objects with the values "A", "B", "C", "D", "E"

3. Loop through the linked list and print each node's values

4. Delete from the linked list the node with value "C"

5. Add to the linked list at index 2 a new node with a value "Z"
*/