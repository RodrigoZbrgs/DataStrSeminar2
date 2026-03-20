package datastr;

public class MyNode {
	private char element;
	
	private MyNode nextNode = null;
	
	private MyNode previousNode = null;

	public char getElement() {
		return element;
	}

	public MyNode getPreviousNode() {
		return previousNode;
	}

	public MyNode getNextNode() {
		return nextNode;
	}
	
	public void setElement(char element) { //kad pariesim uz ttype, tad japarbauda.
		this.element = element;
	}
	
	public void setNextNode(MyNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(MyNode previousNode) {
		this.previousNode = previousNode;
	}
	
	public MyNode(char element) {
		setElement(element);
	}
	
	public String toString() {
		return "" + element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
