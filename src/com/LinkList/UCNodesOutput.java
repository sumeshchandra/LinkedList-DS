package com.LinkList;

public class UCNodesOutput {

	public static void main(String[] args) {
    	INode myFirstNode = new MyNode<Integer>(70);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);

//		myLinkedList.printNodes(); //------------------> UC2

		/**
		 * UC3 Here i have append the nodes to 56,30 to 70
		 */
//		INode myFirstNode = new MyNode<Integer>(56);
//		INode mySecondNode = new MyNode<Integer>(30);
//		INode myThirdNode = new MyNode<Integer>(70);
//
//		MyLinkedList myLinkedList = new MyLinkedList();
//		myLinkedList.add(myFirstNode);
//		myLinkedList.append(mySecondNode);
//		myLinkedList.append(myThirdNode);
//		myLinkedList.printNodes(); // ------------- UC3

		/**
		 * UC4 Here i have used insert method.
		 */
//		INode myFirstNode = new MyNode<Integer>(56);
//		INode mySecondNode = new MyNode<Integer>(30);
//		INode myThirdNode = new MyNode<Integer>(70);
//
//		MyLinkedList myLinkedList = new MyLinkedList();
//		myLinkedList.add(myFirstNode);
//		myLinkedList.append(myThirdNode);
//		myLinkedList.insert(myFirstNode, mySecondNode);
//
//		myLinkedList.printNodes(); // ---------------------> UC4

		/**
		 * UC5 Here i have used i have used pop to check the delete(pop) method.
		 */

//		System.out.println("After deletion ");
//		myLinkedList.pop();
//
//		myLinkedList.printNodes(); // ---------------------> UC5

		/**
		 * UC6 this will delete last element.
		 */

		System.out.println("After deletion of last element");
		myLinkedList.popLast();
		myLinkedList.printNodes();// ---------------------> UC6
	}
}
