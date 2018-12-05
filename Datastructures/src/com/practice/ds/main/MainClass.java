package com.practice.ds.main;

import com.practice.ds.LinkedList;

public class MainClass {
	
	public static void main(String args[])
	{
		LinkedList ls=new LinkedList();
		ls.insertElementAtFront(11);
		ls.insertElementAtFront(10);
		ls.inserElementAtback(13);
		ls.insertAfterPosition(2, 12);
		ls.printList();
		ls.insertElementAtFront(9);
		ls.insertElementAtFront(8);
		ls.insertElementAtFront(7);
		ls.printList();
	/*	ls.deleteAtPosition(4);
		ls.printList();
		ls.searchNode(12);
		System.out.println(ls.size());
		ls.reverseList();
		ls.printList();
		ls.getNodeAt(2);
		ls.printNodeFromEnd(3);*/
		ls.middleOfList();
		ls.middleOfList2();
	}
}
