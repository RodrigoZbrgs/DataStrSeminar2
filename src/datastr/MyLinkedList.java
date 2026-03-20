package datastr;

public class MyLinkedList {

	private MyNode firstNode = null; // get un set netaisam, jo lietotajam nedodam iespeju tikt pie pasiem blokiem
	private MyNode lastNode = null; // get un set netaisam, jo lietotajam nedodam iespeju tikt pie pasiem blokiem
	private int howManyElements = 0; //set funkcijam netaisam, jo nelaujam lietotajam pasam mainit, cik daudz ir elementu.
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	//nedefinesu bezargumenta konstruktoru, jo izmantosu object mantoto
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		try {
		new MyNode('a');
		return false;
		}
		
		catch(OutOfMemoryError error) {
			return true;
		}
	}

	public void add(char element) throws Exception {
		if(isFull()) {
			throw new Exception("Saraksts ir pilns un nevar pievienot elementu");
		}
		//tiks pievienots pirmais elementts un tam izveidots pirmais bloks
		if(howManyElements == 0) {
			MyNode newNode = new MyNode(element);
			firstNode = newNode;
			lastNode = newNode;
			howManyElements++;
		}
		// ja tiek pievienots otrais, tresais... elements
		//TODO ja velas, tad var optimizet kodu, jo ir rindas, kuras sakrit abos gadijumos
		else {
			MyNode newNode = new MyNode(element);
			newNode.setPreviousNode(lastNode);
			lastNode.setNextNode(newNode);
			lastNode = newNode;
			howManyElements++;
			
		}
	}
	
	public void print() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Saraksts ir tukšs un to nevar izprintēt"));	
		}
		MyNode currentNode = firstNode;
		while(currentNode!=null) {
			System.out.println(currentNode.getElement() + "");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}
}
