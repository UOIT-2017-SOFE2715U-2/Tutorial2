
public class MyLinkedList {
	private int size;
	private Node head;
	private Node tail;
	
	// constructor
	public MyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	// getters
	//------------------------------------------
	public Node getHead(){
		return head;
	}
	
	public Node getTail(){
		return tail;
	}
	
	public int getSize(){
		return size;
	}
	//------------------------------------------
	
	public void add(String nodeValue){
		if (head == null){
			head = new Node(nodeValue);
			tail = head;
		}
		else{
			tail.setNext(new Node(nodeValue));
			tail = tail.getNext();
		}
		++size;
	}
	
	// remove the last node
	public void remove(){
		//start from the head node
		Node currentNode = head;
		// iterate through the linked list until reaching 2nd last node
		while (currentNode.getNext() != tail){
			currentNode = currentNode.getNext();
		}
		// set 2nd last node as tail node
		currentNode.setNext(null);
		tail = currentNode;
		--size;
	}
	public void add(String NodeValue, int index){
		// create new node
		Node newNode = new Node(NodeValue);
		// if we want to add new node as head node
		if (index == 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else{
			// start from the head node
			Node currentNode = head;
			// iterate through the nodes until reaching the node before our index
			// decrease index before comparing
			while (--index > 0){
				currentNode = currentNode.getNext();
			}
			Node currentNext = currentNode.getNext();
			currentNode.setNext(newNode);
			currentNode = currentNode.getNext();
			currentNode.setNext(currentNext);
		}
		++size;
	}
	public void remove(int index){
		// if we want to remove the head node
		if (index == 0){
			head = head.getNext();
		}
		else{
			Node currentNode = head;
			Node previouseNode = null;
			while (index-- > 0){
				previouseNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previouseNode.setNext(currentNode.getNext());
		}
		--size;
	}
	/*
	 * next function already define in Node class
	 public Node next(){}
	 */
}
/**
1. Have a function called "add" which adds a Node object to the very end of the list.

2. Have a function called "remove" which removes the Node object from the very end of the list.

3. Have a function called "add" which takes an index argument (optional) that can add a value at the index in the list.

4. Have a function called "remove" which takes an index argument (optional) that can remove a value at the index from the list.

5. Next, which returns the next node object
**/