package com.sandeep.dsa.implementations;

class Node {
	 int data;
	 Node next;
}

class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void showData() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}
public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		list.showData();

	}

}
