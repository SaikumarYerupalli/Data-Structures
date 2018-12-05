package com.practice.ds;

public class LinkedList {
	
	Node head;
	
	
	
	public Node getHead() {
		return head;
	}

	private class Node
	{
		int data;
		Node next;
		
		
		
		public int getData() {
			return data;
		}



		public void setData(int data) {
			this.data = data;
		}



		public Node getNext() {
			return next;
		}



		public void setNext(Node next) {
			this.next = next;
		}



		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertElementAtFront(int data)
	{
		Node new_node=new Node(data);
		if(head==null) {
			System.out.println("Linked List is null");
			head=new_node;
		}
		else
		{
			System.out.println("Linked List is not null");
			new_node.next=head;
			head=new_node;
			
		}
		
	}
	
	public void inserElementAtback(int data)
	{
		Node new_node=new Node(data);
		
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
			
		}
	}
	
	public void insertAfterPosition(int pos,int data)
	{
		if(pos<this.size()) {
		Node new_node=new Node(data);
		Node temp=head;
		int i=1;
		while(i<pos)
		{
			temp=temp.next;
			i++;
		}
		if(temp.next!=null)
		new_node.next=temp.next;
		temp.next=new_node;
		}
		else
		{
			System.out.println("Invalid position");
		}
		
	}
	
	public int deleteFirstElement()
	{
		Node temp=head;
		head=temp.next;
		System.out.println("deleted successfully");
		return temp.data;
	}
	
	public void deleteAtPosition(int pos)
	{
		Node prev=null;
		Node now=head;
		
		if(pos<size()) {
		
		for(int i=0;i<pos;i++)
		{
			prev=now;
			now=now.next;	
		}
		if(prev!=null) {
			prev.next=now.next;
			
		}
		else {
			head=head.next;
		}
		}
		else
			System.out.println("Position Invalid");
		
	}
	
	public void searchNode(int data)
	{
		Node now=head;
		
		while(now!=null)
		{
			if(now.data==data)
			{
				System.out.println(data+ "Found");
				break;
			}
			now=now.next;
		}
	}
	
	public void reverseList()
	{
		Node prev=null;
		Node next=null;
		Node curr=head;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		
				
	}
	
	public int getNodeAt(int pos)
	{
		if(pos>=size()) {
			System.out.println("Invalid pos");
			return -1;
		}
		else {
		Node temp=head;
		while(pos>0) {
			temp=temp.next;
			pos--;
		}
		System.out.println("Node at position has data "+temp.data);
		return temp.data;
		}
	}
	
	public void printNodeFromEnd(int pos)
	{
		Node temp=head;
		System.out.println(temp.data);
		System.out.println(temp.next.data);
		System.out.println(temp.next.next.data);
		
		int lenFromStart=size()-pos;
		while(lenFromStart>0)
		{
			temp=temp.next;
			lenFromStart--;
		}
		System.out.println("Found===="+temp.data);
	}
	
	public void middleOfList()
	{
		int middle=size()/2;
		System.out.println("Middle element position "+middle);
		Node temp=head;
		while(middle>0)
		{
			temp=temp.next;
			middle--;
		}
		System.out.println("Middel element has data "+temp.data);
	}
	
	public void middleOfList2()
	{
		Node slwPtr=head;
		Node fstPtr=head;
		while(slwPtr!=null && fstPtr!=null)
		{
			slwPtr=slwPtr.next;
			try {
			fstPtr=fstPtr.next.next;
			}catch (Exception e) {
				break;
			}
		}
		System.out.println("Middle of list 2 "+slwPtr.data);
	}
	
	public void loopExist()
	{
		
	}
	public void setHead(Node head) {
		this.head = head;
	}

	public int size()
	{
		int i=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			i++;
		}
		return i;
	}
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
			
		}
		System.out.println();
	}
	
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
