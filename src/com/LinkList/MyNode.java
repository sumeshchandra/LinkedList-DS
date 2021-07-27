package com.LinkList;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    /**
     * took key as a parameter in this constructor.
     * where it initiate key value and next value should be null.
     */
    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }
    /**
     * here we have used getter and setter method for key and INode.
     */
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    /**
     * here it will set the next key value.
     */
    public void setNext(INode next) {
        this.next = next;
    }
}
