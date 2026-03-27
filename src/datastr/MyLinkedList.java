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
	
	
	public void add(char element, int position) throws Exception {
		if(position < 0) {
			throw new Exception("Pozicija nevar but mazak par 0");
		}
		if(position > howManyElements) {
			throw new Exception("Pozicija ir lielaka ka atlauta");
		}
		//1. ievietot sakuma ka nulto elementu
		if(position==0) {
			MyNode newNode = new MyNode(element);
			firstNode.setPreviousNode(newNode);
			newNode.setNextNode(firstNode);
			firstNode=newNode;
			howManyElements++;
			
		}
		//2.Piekabinat beigas ka pedejo elementu
		if(position == howManyElements)
		{
			add(element);
		}
		
		//3.Iespraudam elementu pa vidu.
		else
		{
			MyNode currentNode = firstNode;
			for(int i = 1; i <= position; i++) {
				currentNode = currentNode.getNextNode();
			}
			
			MyNode previousNode = currentNode;
			MyNode nextNode = currentNode.getNextNode();
			
			MyNode newNode = new MyNode(element);
			newNode.setPreviousNode(previousNode);
			previousNode.setNextNode(newNode);
			
			newNode.setNextNode(nextNode);
			nextNode.setPreviousNode(newNode);
			
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

	//1. izveidot remove funkcijas deklaraciju, padodoto poziviju
	public void remove(int position) throws Exception{
		if(isEmpty()) {
			throw (new Exception("Saraksts ir tukšs, tāpēc nevar izdzēst elementus"));
		}
		
		if(position < 0) {
			throw (new Exception("Nevar izdzēst elementu, jo pozīcija ir negatīva"));
		}
		
		if(position >= howManyElements) {
			throw (new Exception("Nevar izdzēst elementu, jo pozīcija ir lielāks ka elementu skaits"));
		}
	

	//Pirmā bloka dzēšana
	if(position == 0) {
		MyNode newFirstNode = firstNode.getNextNode();
		newFirstNode.setPreviousNode(null);
		firstNode = newFirstNode;
		howManyElements--;		
	}
	//dzēšam pēdējo bloku
	else if(position == howManyElements-1)
	{
		MyNode newLastNode = lastNode.getPreviousNode();
		newLastNode.setNextNode(null);
		lastNode = newLastNode;
		howManyElements--;
	}
	//dzēsam bloku pa vidu
	else
	{
		MyNode currentNode = firstNode;
		for(int i = 1; i < position; i++) {
			currentNode = currentNode.getNextNode();
		}
		
		MyNode newLeftNode = currentNode;
		MyNode newRightNode = currentNode.getNextNode().getNextNode();
		
		newLeftNode.setNextNode(newRightNode);
		newRightNode.setPreviousNode(newLeftNode);
		
		howManyElements--;
		}
		
	}
	
	public char get(int position) throws Exception {
		if(isEmpty()) {
			throw (new Exception("Saraksts ir tukšs, tāpēc nevar izgust elementus"));
		}
		
		if(position < 0) {
			throw (new Exception("Nevar izgut elementu, jo pozīcija ir negatīva"));
		}
		
		if(position >= howManyElements) {
			throw (new Exception("Nevar izgut elementu, jo pozīcija ir lielāks ka elementu skaits"));
		}
	
		MyNode currentNode = firstNode;
		for(int i = 1; i <= position; i++) {
			currentNode = currentNode.getNextNode()
;		}
		
		return currentNode.getElement();	
	}

	//search
	public int search(char element) throws Exception {
		if(isEmpty()) {
			throw (new Exception("Saraksts ir tukšs, tāpēc nevar meklet elementus"));
		}
		
		int foundPosition = 0;
		MyNode currentNode = firstNode;
		while(currentNode!=null) {
			if(currentNode.getElement() == element) {
				return foundPosition;
			}
			foundPosition++;
			currentNode = currentNode.getNextNode();
		}
		
		throw new Exception("Mekletais elements neeksiste saraksta");
	
	}
	//makeEmpty
	public void makeEmpty() {
		firstNode = null;
		lastNode = null;
		howManyElements = 0;
		System.gc();
	}


}
