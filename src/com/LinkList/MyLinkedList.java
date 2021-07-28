package com.LinkList;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;

	}

	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			INode temp = head;
			this.head = node;
			this.head.setNext(temp);
		}

	}
	 public void append(INode myNode){
	        if (this.head==null){
	            this.head=myNode;
	        }
	        if (this.tail==null){
	            this.tail=myNode;
	        }else {
	            this.tail.setNext(myNode);
	            this.tail=myNode;
	        }
	 }

	public void printNodes() {

		StringBuilder nodes = new StringBuilder("Node Keys : ");

		INode temp = this.head;
		while (temp != null) {
			nodes.append(temp.getkey());
			if (temp != tail) {
				nodes.append("->");
			}
			temp = temp.getNext();

		}

		System.out.println(nodes);

	}

}
