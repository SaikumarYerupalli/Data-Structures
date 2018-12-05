package com.practice.ds;

public class ArrayStack1 {
	
	int top;
	int elements[];
	int len;
	
	public ArrayStack1()
	{
		
	}
	public ArrayStack1(int len)	{
		this.len=len;
		this.top=-1;
		this.elements=new int[len];
	}
	
	public void push(int data)
	{
		if(top+1>len)
		{
			System.out.println("Stack is full");
		}
		else
		{
			elements[++top]=data;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else {
		int poppedElement=elements[top--];
		return poppedElement;
		}
		
	}
	
	public int size()
	{
		
		return top+1;
		
	}
	
	public boolean isEmpty()
	{
		if(top<0)
		return true;
		else
			return false;
		
	}
	public boolean isFull()
	{
		if(top+1>=len)
		return true;
		else
			return false;
		
	}
	
	
	public static void main(String args[])
	{
		ArrayStack1 arrayStack=new ArrayStack1(10);
		System.out.println("Is empty? "+arrayStack.isEmpty());
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(5);
		arrayStack.push(6);
		arrayStack.push(7);
		arrayStack.push(8);
		arrayStack.push(9);
		arrayStack.push(10);
		
		System.out.println("Is full? "+arrayStack.isFull());
		System.out.println("Popped Element "+arrayStack.pop());
		System.out.println("Popped Element "+arrayStack.pop());
		System.out.println("Popped Element "+arrayStack.pop());
		System.out.println("Popped Element "+arrayStack.pop());
		
		System.out.println("Is empty? "+arrayStack.isEmpty());
		
		System.out.println("Is full? "+arrayStack.isFull());
		
	}
}
