package datastr;

public class MyNode<Ttype>{
	private Ttype element;
	
	private MyNode nextNode = null;
	
	private MyNode previousNode = null;

	public Ttype getElement() {
		return element;
	}

	public MyNode getPreviousNode() {
		return previousNode;
	}

	public MyNode getNextNode() {
		return nextNode;
	}
	
	public void setElement(Ttype element) { //kad pariesim uz ttype, tad japarbauda.
		this.element = element;
	}
	
	public void setNextNode(MyNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(MyNode previousNode) {
		this.previousNode = previousNode;
	}
	
	public MyNode(Ttype element) {
		setElement(element);
	}
	
	public String toString() {
		return "" + element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
