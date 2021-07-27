package com.LinkList;

public class MyNode<K> {
    private K key;
    private MyNode next;

    /**
     * took key as a parameter in this constructor.
     * where it initiate key value and next value should be null.
     */
    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }

    /**
     * here we have used getter method.
     */
    public MyNode getNext() {
        return next;
    }

    /**
     * here it will set the next key value.
     */
    public void setNext(MyNode next) {
        this.next = next;
    }
}
