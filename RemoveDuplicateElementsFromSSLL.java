package com.daniel;

import java.util.Scanner;

/*

daniel-angali

Removes Duplicate Elements from Sorted Singly LinkedList (SSLL)
Sample:

Enter no. of elements: 
14
Enter elements: 
1 1 4 4 4 8 10 10 10 10 13 13 16 19
Elements in the LinkedList
1->1->4->4->4->8->10->10->10->10->13->13->16->19->
Removed duplicate elements.
Elements in the LinkedList
1->4->8->10->13->16->19->


 */
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node head,tail;
	
	void insert(int data)
	{
		if( head == null)
			head = tail = new Node(data);
		else
		{
			Node temp = new Node(data);
			tail.next = temp;
			tail = temp;
			
		}
	}
	
	void unique()
	{
		if(head == null || head.next == null)
			return;
		else
		{
			Node p = head;
			Node q = head.next;
			while(q != null)
			{
				if(p.data == q.data){
					p.next = q.next;
				//p = p.next;
					}
				else
					p = p.next;
				q = p.next;//q.next;
				
				
			}
		}
		System.out.println("Removed duplicate elements.");
	}
	
	void print()
	{
		
		if(head == null)
			return;
		
		else
		{
			System.out.println("Elements in the LinkedList");
			Node temp = head;
			
			while(temp != null)
			{
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
		System.out.println();
	}
}
public class RemoveDuplicateElementsFromSSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		int noOfElements = sc.nextInt();
		LinkedList l = new LinkedList();
		System.out.println("Enter elements: ");
		while(noOfElements > 0)
		{
			l.insert(sc.nextInt());
			noOfElements--;
		}
		l.print();
		l.unique();
		l.print();
		

	}

	
}
