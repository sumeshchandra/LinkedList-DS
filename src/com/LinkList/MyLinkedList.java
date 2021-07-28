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

	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	/**
	 * this pop method will delete the first value of the linkedlist.
	 * */
	public INode pop() {
		INode node = this.head;
		this.head = head.getNext();
		return node;
	}

	/**
	 * here i have added insert method which took two inputs given below.
	 */
	public void insert(INode myNode, INode newNode) {
		INode temp = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);
	}
	
	/**
     * this method will delete the last element of the linkedList.
     */
    public INode popLast() {
        INode temp = head;
        while (temp.getNext() != this.tail) {
            temp = temp.getNext();
        }
      //tail.setNext(tempNode);
        this.tail = temp;
        temp = null;
        return temp;
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
