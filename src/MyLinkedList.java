
public class MyLinkedList {
	private int size;
	private Node head;
	private Node tail;
	
	
	public MyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
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
	public void remove(){
		Node currentNode = head;
		while (currentNode.getNext() != tail){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		tail = currentNode;
		--size;
	}
	public void add(String NodeValue, int index){
		Node newNode = new Node(NodeValue);
		if (index == 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else{
			Node currentNode = head;
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
		if (index == 0){
			head = head.getNext();
		}
		else{
			Node currentNode = head;
			Node previouseNode = null;
			while (--index > 0){
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