package com.practice.ds;

public class CircularLinkedList {
	
	Node head;
	Node last;
	
	class Node{
		
		int data;
		Node next;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public void pushLast(int data)
	{
		Node temp=head;
		Node ptr=new Node(data);
		if(temp==null)
		{
			head=ptr;
			head.next=head;
			last=head;
			
		}
		else
		{
			
			while(temp.next!=head)
			{
				temp=temp.next;
			}
				temp.next=ptr;
				ptr.next=head;
				last=ptr;
			}
			
		}
	
	public void pushFront(int data)
	{
		Node temp=head;
		Node ptr=new Node(data);
		if(temp==null)
		{
			head=ptr;
			head.next=head;
			
		}
		else
		{
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=ptr;
			ptr.next=head;
			head=ptr;
			
		}
	}
	
	public void insertAtPos(int data,int pos)
	{
		Node ptr=new Node(data);
		Node temp=head;
		if(pos==1) {
			pushFront(data);
		}
		else if(pos==sizeOf())
		{
			pushLast(data);
		}
		else {
		while(pos>1)
		{
			System.out.println("Inside loop");
			temp=temp.next;
			pos--;
		}
		ptr.next=temp.next;
		
		temp.next=ptr;
		}
	}
	
	public int sizeOf()
	{
		Node temp=head;
		int count=1;
		if(head!=null) {
			while(temp.next!=head)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("Size "+count);
		return count;}
		else
			return 0;
	}
	
	public void printCLL()
	{
		Node temp=head;
		do {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=last.next);
		System.out.println();
		
	}
	
	public void reverse()
	{
		System.out.println("reversal operation");
		Node temp=head;
		Node prev=last;
		Node next=null;
		do
		{
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}while(temp!=head);
		head=prev;
		last=next;
		System.out.println("reversal over");
	}
	public static void main(String args[])
	{
		CircularLinkedList cll=new CircularLinkedList();
		
		cll.pushLast(10);
		cll.pushLast(11);
		cll.pushLast(12);
		cll.pushFront(9);
		cll.pushLast(13);
		cll.pushFront(8);
		cll.pushFront(7);
		cll.pushLast(14);
		cll.printCLL();
		cll.sizeOf();
		cll.reverse();
		cll.printCLL();
	}
	}


