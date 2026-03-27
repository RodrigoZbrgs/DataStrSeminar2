package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList symbols = new MyLinkedList();
		try
		{
		symbols.add('B');
		symbols.add('A');
		symbols.add('C');
		symbols.print(); //B A C G
		System.out.println("Pievienot elementu sakuma");
		symbols.add('Z',0); // Z B A C G
		symbols.print();
		System.out.println("Pievienot elementu beigas");
		symbols.add('W',5); // Z B A C G W
		symbols.print();
		System.out.println("Pievienot elementu pa vidu -2.poz");
		symbols.add('K', 2); // Z B A K C G W
		symbols.print();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
