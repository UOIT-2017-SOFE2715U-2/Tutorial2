
public class Node {
	private String value;
	private Node next;
	
	// Constructor
	public Node(String value){
		this.value = value;
		next = null;
	}
	public Node getNext(){
		
		return next;
	}
	public void setNext(Node nextNode){
		next = nextNode;
	}
}
