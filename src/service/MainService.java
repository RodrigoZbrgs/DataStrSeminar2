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
		
		
		System.out.println("Dzesam elementu no sakuma");
		symbols.remove(0);
		symbols.print(); //B A K C G W
		
		System.out.println("Izdzesam elementu no beigam");
		symbols.remove(5);
		symbols.print();// B A K C G
		
		System.out.println("Izdzesam elementu no vidus");
		symbols.remove(3);
		symbols.print();//B A K G
		
		System.out.println("Izgut elementu no 2 pozicijas");
		System.out.println(symbols.get(2)); //A
		
		System.out.println("Meklejam elementu K poziciju");
		System.out.println(symbols.search('K')); //2
		
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
