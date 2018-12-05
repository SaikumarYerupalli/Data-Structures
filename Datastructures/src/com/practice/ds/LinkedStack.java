package com.practice.ds;


public class LinkedStack {
	
	LinkedList ls;
	int size;
	int top;
	
	public LinkedStack(int size)
	{
		this.size=size;
		this.top=-1;
		this.ls=new LinkedList();
		
	}
	
	public boolean isEmpty()
	{
		if(ls.head==null)
			return true;
					
			else
		return false;
		
	}
	
	public boolean isFull()
	{
		if(ls.size()==size)
		return true;
		else
			return false;
		
	}
	
	public void push(int data)
	{
		if(top+1<size) {
		ls.inserElementAtback(data);
		top++;}
		else
			System.out.println("Stack is full");
	}
	
	public int pop()
	{
		ls.printList();
		int poppedElement;
		if(ls.size()>0) {
	    poppedElement = ls.getNodeAt(top);
		ls.deleteAtPosition(top);
		top--;
		return poppedElement;
		}
		else
			return -1;
	}
	
	public int length()
	{
		
		return ls.size();
	}
	
	public static void main(String args[])
	{
	
		LinkedStack linkedStack=new LinkedStack(5);
		
		System.out.println("Is empty? "+linkedStack.isEmpty());
		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(5);
		System.out.println("Is full? "+linkedStack.isFull());
		System.out.println(linkedStack.pop());
		
	}

}
