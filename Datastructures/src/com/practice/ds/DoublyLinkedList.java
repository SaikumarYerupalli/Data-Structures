package com.practice.ds;

public class DoublyLinkedList {
	
	Node head;

	class Node{
		
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
	
	public void pushLast(int data)
	{
		Node ptr=new Node(data);
		Node temp=head;
		if(temp==null)
		{
			head=ptr;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=ptr;
			ptr.prev=temp;
			ptr.next=null;
		}
	}
	
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		

	}
	
	public void pushFront(int data)
	{
		Node ptr=new Node(data);
		ptr.next=head;
		head.prev=ptr;
		head=ptr;
	}
	
	public void pushAtPos(int data,int pos)
	{
		Node ptr=new Node(data);
		Node temp=head;
		if(pos==0 || pos==1)
		{
			pushFront(data);
		}
		else if(pos==size()) {
			pushLast(data);
		}
		else
		{
			while(pos>1) {
				
				temp=temp.next;
				pos--;
			}
			
			temp.next.prev=ptr;
			ptr.next=temp.next;
			temp.next=ptr;
			ptr.prev=temp;
		}
	}
	public void reverse()
	{
		Node prev=null;
		Node next=null;
		Node curr=head;
		do {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}while(null!=curr);
			head=prev;
	}
	
	public int size()
	{
		Node temp=head;
		int count=0;
		do {
			count++;
			temp=temp.next;
		}while(temp!=null);
		System.out.println("Size "+count);
		return count;
	}
	public static void main(String args[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.pushLast(10);
		dll.pushLast(12);
		dll.pushLast(14);
		dll.pushLast(16);
		dll.pushFront(9);
		dll.pushFront(8);
		dll.pushLast(17);
		dll.printList();
		dll.pushAtPos(2,7);
		
		dll.printList();
		dll.reverse();
		System.out.println();
		dll.printList();
	}
}
