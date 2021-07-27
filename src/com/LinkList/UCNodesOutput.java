package com.LinkList;

public class UCNodesOutput {

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);

        if (myFirstNode.getNext() == mySecondNode && mySecondNode.getNext() == myThirdNode) {
            System.out.println("Nodes are Connected");

        }
    }
}
