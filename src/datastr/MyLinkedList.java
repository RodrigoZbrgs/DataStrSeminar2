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
	
}
